package com.example.androidstudytutorial.dialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudytutorial.BuildConfig;
import com.example.androidstudytutorial.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<CustomListModel> data;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<CustomListModel> data) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getText());
        holder.image_view.setBackgroundResource(data.get(position).getImage());

        holder.textView.setOnClickListener(v -> {
            if(holder.textView.getText().toString().equalsIgnoreCase(v.getContext().getString(R.string.share))){
                shareApp(v.getContext());
            }else if(holder.textView.getText().toString().equalsIgnoreCase(v.getContext().getString(R.string.rate))){
                rateUs(v.getContext());
            }else{

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView image_view;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            image_view =itemView.findViewById(R.id.image_view);
        }
    }

    private void shareApp(Context context){
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, context.getResources().getString(R.string.app_name));
            String shareMessage= "\nAndroid Interview Preparation for your Phones and Tablets \n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            context.startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch(Exception e) {
            e.toString();
        }
    }


    private void rateUs(Context context){
        String packageName = BuildConfig.APPLICATION_ID; // get the package name of your app
        try {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
        } catch (android.content.ActivityNotFoundException e) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }


    }
}

