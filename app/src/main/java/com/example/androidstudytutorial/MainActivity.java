package com.example.androidstudytutorial;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudytutorial.dialog.MyBottomSheetDialogFragment;
import com.example.androidstudytutorial.listners.CallFragment;
import com.example.androidstudytutorial.main.DisplayFragment;
import com.example.androidstudytutorial.main.MainFragment;
import com.example.androidstudytutorial.model.Descx;
import com.example.androidstudytutorial.recyclerview.ListRecyclerView;
import com.example.androidstudytutorial.utility.SharedPrefUtility;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements CallFragment {

    private final String TAG = MainActivity.class.getSimpleName();
    private ImageView mMenu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_color));

        mMenu = findViewById(R.id.menu);
        mMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomSheetDialog();
               // alertDialogBox();
            }
        });
        SharedPrefUtility.writePreferencesQuestions(getApplicationContext());
        SharedPrefUtility.writePreferencesAnswers(getApplicationContext());

        loadFragment();



    }



    @Override
    public void showFragment(List<Descx> descxList,int pos , String key , String value) {
        // Add the fragment to the activity, pushing this transaction
        // on to the back stack.
        DisplayFragment displayFragment =new DisplayFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Bundle bundle =new Bundle();
        bundle.putString("QUESTIONS",key);
        bundle.putString("ANSWERS",value);
        bundle.putInt("INDEX",pos);

        if(descxList != null)
             bundle.putParcelableArrayList("custom_list", (ArrayList<? extends Parcelable>) descxList);

        displayFragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(R.id.mainLayout, displayFragment,DisplayFragment.class.getSimpleName()).
                addToBackStack(null).
                commit();

    }



    private void loadFragment(){
        MainFragment mainFragment =new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mainLayout, mainFragment,MainFragment.class.getSimpleName()).
                addToBackStack(null).commit();
    }



    @Override
    public void onBackPressed() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        int entryCount = fragmentManager.getBackStackEntryCount();
        final String name = String.valueOf(fragmentManager.findFragmentByTag(MainFragment.class.getSimpleName()));
        Log.i(TAG,"Fragment Name ="+name +"entryCount = "+entryCount);
        if(entryCount ==1){
            finishAffinity();
        }else{
            super.onBackPressed();
        }

    }


    private void showDialog(Context context, String headerText, String messageText) {
        AlertDialog dialog;

        View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_layout, null);
        TextView dialogHeader = dialogView.findViewById(R.id.dialog_header);
        dialogHeader.setText(headerText);

        TextView dialogMessage = dialogView.findViewById(R.id.dialog_message);
        dialogMessage.setText(messageText);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(dialogView)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // handle the "OK" button click
                        dialog.cancel();
                    }
                });

        dialog = builder.create();
        dialog.show();
    }


    private void showCustomSheetDialog()
    {
        MyBottomSheetDialogFragment myBottomSheetDialogFragment = new MyBottomSheetDialogFragment();
        myBottomSheetDialogFragment.show(getSupportFragmentManager(),"MyBottomSheetDialogFragment");

    }


}