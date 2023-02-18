package com.example.androidstudytutorial.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudytutorial.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private List<CustomListModel> customListModelList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialog);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_sheet, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new CustomAdapter(getContext(), getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    private List<CustomListModel> getData() {
        // create and return your data list here
        customListModelList = new ArrayList<>();

        int[] images = {R.drawable.share, R.drawable.rate, R.drawable.more};
        String[] texts = {getString(R.string.share), getString(R.string.rate), getString(R.string.more)};

        for (int i = 0; i < images.length; i++) {
            CustomListModel c = new CustomListModel();
            c.setImage(images[i]);
            c.setText(texts[i]);
            customListModelList.add(c);
        }

        return customListModelList;
    }

}
