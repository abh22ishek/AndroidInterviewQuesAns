package com.example.androidstudytutorial.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudytutorial.R;
import com.example.androidstudytutorial.fonts.CustomFontTextView;
import com.example.androidstudytutorial.listners.CallFragment;
import com.example.androidstudytutorial.main.DisplayFragment;
import com.example.androidstudytutorial.model.Descx;

import java.util.List;

public class ListRecyclerView extends RecyclerView.Adapter<ListRecyclerView.ListHolder> {

    private Context mContext;
    private List<Descx> mDescList;
    CallFragment callFragment;


    public ListRecyclerView(Context mContext, List<Descx> mDescList ,CallFragment callFragment) {
        this.mContext = mContext;
        this.mDescList = mDescList;
        this.callFragment = callFragment;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_bg, parent, false);
        ListHolder listHolder = new ListHolder(view);
        return listHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
      if(mDescList !=null){
          final  Descx descx = mDescList.get(position);
          holder.textView.setText(descx.getQuestions());
          holder.textCount.setText(position+1+".");
      }

      holder.relative.setOnClickListener(view -> callFragment.showFragment(mDescList,holder.getAdapterPosition(),mDescList.get(holder.getAdapterPosition()).getQuestions(),
              mDescList.get(holder.getAdapterPosition()).getAnswers()));



    }

    @Override
    public int getItemCount() {
        return mDescList.size();
    }


    public static class ListHolder extends RecyclerView.ViewHolder {

        private CustomFontTextView textView;
        private CustomFontTextView textCount;

        private RelativeLayout relative;


        public ListHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.info_text);
            textCount = itemView.findViewById(R.id.textCount);
            relative =itemView.findViewById(R.id.relative);

        }
    }
}
