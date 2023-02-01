package com.example.androidstudytutorial.main;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudytutorial.MainActivity;
import com.example.androidstudytutorial.R;
import com.example.androidstudytutorial.listners.CallFragment;
import com.example.androidstudytutorial.model.Descx;
import com.example.androidstudytutorial.recyclerview.ListRecyclerView;
import com.example.androidstudytutorial.utility.SharedPrefUtility;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private final String TAG = MainFragment.class.getSimpleName();
    private RecyclerView recyclerView;
    private CallFragment callFragment;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        callFragment = (CallFragment) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.main_fragment, container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        populateListRecyclerView();
    }


    private void populateListRecyclerView(){
        final ListRecyclerView listRecyclerView = new ListRecyclerView(getActivity(), calculateQuestions(getActivity()), callFragment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listRecyclerView);
    }

    List<Descx> descxList;
    private List<Descx> calculateQuestions(Context context){
        descxList =new ArrayList<>();
        List<String> qList = SharedPrefUtility.readPreferencesQuestions(context);
        List<String> ansList = SharedPrefUtility.readPreferencesAnswers(context);
        Descx d;
        for(int i=0;i<qList.size();i++){
            d = new Descx(i,qList.get(i),ansList.get(i));
            descxList.add(d);
        }
        return descxList;
    }
}
