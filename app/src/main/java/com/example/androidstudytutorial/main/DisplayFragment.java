package com.example.androidstudytutorial.main;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
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
    List<Descx> descxList;
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
        descxList = getArguments().getParcelableArrayList("custom_list");
        textViewQuestions.setText(new StringBuilder().append(index + 1).append(".").append(" ").append(descxList.get(index).getQuestions()).toString());

        final String htmlString = descxList.get(index).getAnswers();
       // textViewAnswers.setText(htmlString);
        if (htmlString != null) {
            final Spanned spanned = HtmlCompat.fromHtml(htmlString, HtmlCompat.FROM_HTML_MODE_LEGACY);
            final String plainText = spanned.toString();
            // Do something with plainText here
            textViewAnswers.setText(htmlString);
        }
        textViewAnswers.setMovementMethod(new ScrollingMovementMethod());

     /*   imageNext.setOnClickListener(new View.OnClickListener() {
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
*/



        imageNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == descxList.size() - 1) {
                    updateUI(0);
                } else {
                    updateUI(index + 1);
                }
            }
        });

        imagePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0) {
                    updateUI(descxList.size() - 1);
                } else {
                    updateUI(index - 1);
                }
            }
        });

        //
    }

    private void updateUI(int newIndex) {
        index = newIndex;
        textViewQuestions.setText((index + 1) + ". " + descxList.get(index).getQuestions());
        textViewAnswers.setText(descxList.get(index).getAnswers());
    }
}
