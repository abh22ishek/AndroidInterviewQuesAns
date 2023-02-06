package com.example.androidstudytutorial.main;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidstudytutorial.R;
import com.example.androidstudytutorial.fonts.CustomFontTextView;
import com.example.androidstudytutorial.model.Descx;

import java.util.ArrayList;
import java.util.List;

public class DisplayFragment extends Fragment {

    String mQuestions;
    String mAnswers;
    private ImageView imagePrevious;
    private ImageView imageNext;

    CustomFontTextView textViewQuestions;
    CustomFontTextView textViewAnswers;

    int index =0;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fragment_layout, container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textViewAnswers = view.findViewById(R.id.txtAnswers);
        textViewQuestions =view.findViewById(R.id.txtQuestions);

        imageNext = view.findViewById(R.id.imageNext);
        imagePrevious =view.findViewById(R.id.imagePrev);


        index =  getArguments().getInt("INDEX");
        List<Descx> descxList = getArguments().getParcelableArrayList("custom_list");
        textViewQuestions.setText(index+1+"."+" "+ descxList.get(index).getQuestions());
        textViewAnswers.setText(descxList.get(index).getAnswers());


        textViewAnswers.setMovementMethod(new ScrollingMovementMethod());

        imageNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == descxList.size()-1){
                    index =0 ;
                }
                else{
                    index++;
                    textViewQuestions.setText(index+1+"."+" "+ descxList.get(index).getQuestions());
                    textViewAnswers.setText(descxList.get(index).getAnswers());
                }
            }
        });

        imagePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index ==0){
                    index =descxList.size()-1;
                }else{
                    index--;
                    textViewQuestions.setText(index+1+"."+" "+ descxList.get(index).getQuestions());
                    textViewAnswers.setText(descxList.get(index).getAnswers());
                }
            }
        });

        textViewAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        //
    }
}
