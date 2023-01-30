package com.example.androidstudytutorial;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.status_color));



        SharedPrefUtility.writePreferencesQuestions(getApplicationContext());
        SharedPrefUtility.writePreferencesAnswers(getApplicationContext());

        loadFragment();



    }



    @Override
    public void showFragment(String key , String value) {
        // Add the fragment to the activity, pushing this transaction
        // on to the back stack.
        DisplayFragment displayFragment =new DisplayFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Bundle bundle =new Bundle();
        bundle.putString("QUESTIONS",key);
        bundle.putString("ANSWERS",value);
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

}