package com.example.androidstudytutorial.main;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidstudytutorial.R;
import com.example.androidstudytutorial.fonts.CustomFontTextView;

public class DisplayFragment extends Fragment {

    String mQuestions;
    String mAnswers;


    CustomFontTextView textViewQuestions;
    CustomFontTextView textViewAnswers;

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

        mQuestions  = getArguments().getString("QUESTIONS");
        mAnswers  = getArguments().getString("ANSWERS");

        textViewQuestions.setText(mQuestions);
        textViewAnswers.setText(mAnswers);


        textViewAnswers.setMovementMethod(new ScrollingMovementMethod());
    }
}
