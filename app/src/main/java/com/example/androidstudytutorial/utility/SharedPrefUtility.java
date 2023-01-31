package com.example.androidstudytutorial.utility;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.androidstudytutorial.R;

import java.util.ArrayList;
import java.util.List;

public class SharedPrefUtility {

    public final String KEY_QUESTION="batch_01_part1";
    public static String QUESTION_FILES_01="android_batch_01_part1";
    public static String ANSWERS_FILES_01="android_batch_01_part1_answers";

    public static List<String> readPreferencesQuestions(Context context)
    {
        SharedPreferences sh = context.getSharedPreferences(QUESTION_FILES_01, MODE_PRIVATE);
        List<String> questionList =new ArrayList<>();
        questionList.add(sh.getString("01",""));
        questionList.add(sh.getString("02",""));
        questionList.add(sh.getString("03",""));
        questionList.add(sh.getString("04",""));
        questionList.add(sh.getString("05",""));
        questionList.add(sh.getString("06",""));
        questionList.add(sh.getString("07",""));
        questionList.add(sh.getString("08",""));
        questionList.add(sh.getString("09",""));
        questionList.add(sh.getString("10",""));
        questionList.add(sh.getString("11",""));
        questionList.add(sh.getString("12",""));
        questionList.add(sh.getString("13",""));
        questionList.add(sh.getString("14",""));
        questionList.add(sh.getString("15",""));
        questionList.add(sh.getString("16",""));


        questionList.add(sh.getString("17",""));
        questionList.add(sh.getString("18",""));
        questionList.add(sh.getString("19",""));
        questionList.add(sh.getString("20",""));
        questionList.add(sh.getString("21",""));
        questionList.add(sh.getString("22",""));
        questionList.add(sh.getString("23",""));
        questionList.add(sh.getString("24",""));
        questionList.add(sh.getString("25",""));
        questionList.add(sh.getString("26",""));

        questionList.add(sh.getString("27",""));
        questionList.add(sh.getString("28",""));
        questionList.add(sh.getString("29",""));
        questionList.add(sh.getString("30",""));
        questionList.add(sh.getString("31",""));
        questionList.add(sh.getString("32",""));
        questionList.add(sh.getString("33",""));


        questionList.add(sh.getString("34",""));
        questionList.add(sh.getString("35",""));
        questionList.add(sh.getString("36",""));
        questionList.add(sh.getString("37",""));
        questionList.add(sh.getString("38",""));
        questionList.add(sh.getString("39",""));
        questionList.add(sh.getString("40",""));
        questionList.add(sh.getString("41",""));
        questionList.add(sh.getString("42",""));
        questionList.add(sh.getString("43",""));
        questionList.add(sh.getString("44",""));
        questionList.add(sh.getString("45",""));
        questionList.add(sh.getString("46",""));
        questionList.add(sh.getString("47",""));
        questionList.add(sh.getString("48",""));
        questionList.add(sh.getString("49",""));
        questionList.add(sh.getString("50",""));

        questionList.add(sh.getString("51",""));
        questionList.add(sh.getString("52",""));
        questionList.add(sh.getString("53",""));
        questionList.add(sh.getString("54",""));
        questionList.add(sh.getString("55",""));
        questionList.add(sh.getString("56",""));
        questionList.add(sh.getString("57",""));


        return questionList;

    }


    public static List<String> readPreferencesAnswers(Context context)
    {
        SharedPreferences sh = context.getSharedPreferences(ANSWERS_FILES_01, MODE_PRIVATE);
        List<String> questionList =new ArrayList<>();
        questionList.add(sh.getString("01",""));
        questionList.add(sh.getString("02",""));
        questionList.add(sh.getString("03",""));
        questionList.add(sh.getString("04",""));
        questionList.add(sh.getString("05",""));
        questionList.add(sh.getString("06",""));
        questionList.add(sh.getString("07",""));
        questionList.add(sh.getString("08",""));
        questionList.add(sh.getString("09",""));
        questionList.add(sh.getString("10",""));
        questionList.add(sh.getString("11",""));
        questionList.add(sh.getString("12",""));
        questionList.add(sh.getString("13",""));
        questionList.add(sh.getString("14",""));
        questionList.add(sh.getString("15",""));
        questionList.add(sh.getString("16",""));
        questionList.add(sh.getString("17",""));
        questionList.add(sh.getString("18",""));
        questionList.add(sh.getString("19",""));
        questionList.add(sh.getString("20",""));
        questionList.add(sh.getString("21",""));
        questionList.add(sh.getString("22",""));
        questionList.add(sh.getString("23",""));
        questionList.add(sh.getString("24",""));
        questionList.add(sh.getString("25",""));
        questionList.add(sh.getString("26",""));

        questionList.add(sh.getString("27",""));
        questionList.add(sh.getString("28",""));
        questionList.add(sh.getString("29",""));
        questionList.add(sh.getString("30",""));
        questionList.add(sh.getString("31",""));
        questionList.add(sh.getString("32",""));
        questionList.add(sh.getString("33",""));

        questionList.add(sh.getString("34",""));
        questionList.add(sh.getString("35",""));
        questionList.add(sh.getString("36",""));
        questionList.add(sh.getString("37",""));
        questionList.add(sh.getString("38",""));
        questionList.add(sh.getString("39",""));
        questionList.add(sh.getString("40",""));
        questionList.add(sh.getString("41",""));
        questionList.add(sh.getString("42",""));
        questionList.add(sh.getString("43",""));
        questionList.add(sh.getString("44",""));
        questionList.add(sh.getString("45",""));
        questionList.add(sh.getString("46",""));
        questionList.add(sh.getString("47",""));
        questionList.add(sh.getString("48",""));
        questionList.add(sh.getString("49",""));
        questionList.add(sh.getString("50",""));

        questionList.add(sh.getString("51",""));
        questionList.add(sh.getString("52",""));
        questionList.add(sh.getString("53",""));
        questionList.add(sh.getString("54",""));
        questionList.add(sh.getString("55",""));
        questionList.add(sh.getString("56",""));
        questionList.add(sh.getString("57",""));



        return questionList;

    }

    public static void writePreferencesQuestions(Context context){
        // Storing data into SharedPreferences
        try{
            SharedPreferences sharedPreferences = context.getSharedPreferences(QUESTION_FILES_01, MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putString("01", QuestionsList.QUESTION_01);
            myEdit.putString("02", QuestionsList.QUESTION_02);
            myEdit.putString("03", QuestionsList.QUESTION_03);
            myEdit.putString("04", QuestionsList.QUESTION_04);
            myEdit.putString("05", QuestionsList.QUESTION_05);
            myEdit.putString("06", QuestionsList.QUESTION_06);
            myEdit.putString("07", QuestionsList.QUESTION_07);
            myEdit.putString("08", QuestionsList.QUESTION_08);
            myEdit.putString("09", QuestionsList.QUESTION_09);
            myEdit.putString("10", QuestionsList.QUESTION_10);

            myEdit.putString("11", QuestionsList.AOSP);
            myEdit.putString("12", QuestionsList.SE_LINUX);
            myEdit.putString("13", QuestionsList.Context);

            myEdit.putString("14", QuestionsList.Threads);
            myEdit.putString("15", QuestionsList.ApplicationClass);

            myEdit.putString("16", QuestionsList.UIThread);

            myEdit.putString("17", QuestionsList.Loopers);
            myEdit.putString("18", QuestionsList.AsyncTask);
            myEdit.putString("19", QuestionsList.AsyncLimitations);
            myEdit.putString("20", QuestionsList.RecyclerView);
            myEdit.putString("21", QuestionsList.ViewHolderPattern);
            myEdit.putString("22", QuestionsList.Anr);
            myEdit.putString("23", QuestionsList.ViewModel);
            myEdit.putString("24", QuestionsList.ViewModelConfig);
            myEdit.putString("25", QuestionsList.JetPack);
            myEdit.putString("26", QuestionsList.PatternS);

            myEdit.putString("27", QuestionsList.Singelton);
            myEdit.putString("28", QuestionsList.Room);
            myEdit.putString("29", QuestionsList.Timer);
            myEdit.putString("30", QuestionsList.SystemApps);
            myEdit.putString("31", QuestionsList.BroadCast);
            myEdit.putString("32", QuestionsList.AsyncLimitations);
            myEdit.putString("33", QuestionsList.WorkManager);

            myEdit.putString("34", QuestionsList.IntentFilter);
            myEdit.putString("35", QuestionsList.Retrofit);
            myEdit.putString("36", QuestionsList.Glide);
            myEdit.putString("37", QuestionsList.RecyclerListView);
            myEdit.putString("38", QuestionsList.ContentProvider);
            myEdit.putString("39", QuestionsList.ExecThread);
            myEdit.putString("40", QuestionsList.RxJava);
            myEdit.putString("41", QuestionsList.RxJava_Map);
            myEdit.putString("42", QuestionsList.RxJava_Observable);
            myEdit.putString("43", QuestionsList.DependencyInjection);

            myEdit.putString("44", QuestionsList.Services);
            myEdit.putString("45", QuestionsList.Services_IntentService);

            myEdit.putString("46", QuestionsList.EventBus);
            myEdit.putString("47", QuestionsList.NotificationListnerService);
            myEdit.putString("48", QuestionsList.LaunchModes);
            myEdit.putString("49", QuestionsList.IntentFlags);
            myEdit.putString("50", QuestionsList.Parceable);

            myEdit.putString("51", QuestionsList.ProductFlavours);
            myEdit.putString("52", QuestionsList.LiveData);
            myEdit.putString("53", QuestionsList.SharedPrefrences);
            myEdit.putString("54", QuestionsList.Databinding);
            myEdit.putString("55", QuestionsList.FCM);
            myEdit.putString("56", QuestionsList.Fragment_add_replace);
            myEdit.putString("57", QuestionsList.addBackToStack);








            myEdit.apply();

        }catch (Exception e)
        {
            e.printStackTrace();
            Log.d("SharedPrefUtility","error catch block");
        }

    }



    public static void writePreferencesAnswers(Context context){
        // Storing data into SharedPreferences
        try{
            SharedPreferences sharedPreferences = context.getSharedPreferences(ANSWERS_FILES_01, MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putString("01", AnswerList.answers_01);
            myEdit.putString("02", AnswerList.answers_02);
            myEdit.putString("03",AnswerList.answers_activity_cycle);
            myEdit.putString("04",AnswerList.answers_04);
            myEdit.putString("05",AnswerList.intents);
            myEdit.putString("06",AnswerList.answers_activity_cycle);
            myEdit.putString("07",AnswerList.fragments);
            myEdit.putString("08",AnswerList.fragments);

            myEdit.putString("09",AnswerList.screen_sizes);
            myEdit.putString("10",AnswerList.handlers);

            myEdit.putString("11",AnswerList2.AOSP);
            myEdit.putString("12",AnswerList2.SE_LINUX);
            myEdit.putString("13",AnswerList2.Context);

            myEdit.putString("14",AnswerList2.Threads);
            myEdit.putString("15",context.getResources().getString(R.string.application_class));
            myEdit.putString("16",context.getResources().getString(R.string.ui_thread));

            myEdit.putString("17",context.getResources().getString(R.string.loopers));
           myEdit.putString("18",AnswerList2.asynctask);
            myEdit.putString("19",AnswerList2.asynctasklimitations);
            myEdit.putString("20",AnswerList2.work_manager);

            myEdit.putString("21", AnswerList2.ViewHolderPatterns);
            myEdit.putString("22", AnswerList2.ANR);
            myEdit.putString("23", AnswerList2.ViewModel);
            myEdit.putString("24",AnswerList2.ViewModelConfig);

            myEdit.putString("25", AnswerList2.JetPackComponent);
            myEdit.putString("26", AnswerList2.Patterns);

            myEdit.putString("27", AnswerList3.Singelton);
            myEdit.putString("28", AnswerList3.Room);
            myEdit.putString("29", AnswerList3.Alarm);
            myEdit.putString("30", AnswerList3.SystemApps);
           myEdit.putString("31", AnswerList3.broadcast);
           myEdit.putString("32", AnswerList3.asyncLimitations);
           myEdit.putString("33", AnswerList2.work_manager);

           myEdit.putString("34", AnswerList3.Intent_Filter);
          myEdit.putString("35", AnswerList3.Retrofit);
           myEdit.putString("36", AnswerList3.Glide);
           myEdit.putString("37", AnswerList3.RecyclerViewPerfomance);
           myEdit.putString("38", AnswerList3.ContentProvider);
          myEdit.putString("39", AnswerList3.ExecThread);

//            myEdit.putString("40", QuestionsList.RxJava);
//            myEdit.putString("41", QuestionsList.RxJava_Map);
//            myEdit.putString("42", QuestionsList.RxJava_Observable);
//            myEdit.putString("43", QuestionsList.DependencyInjection);
//
//            myEdit.putString("44", QuestionsList.Services);
//            myEdit.putString("45", QuestionsList.Services_IntentService);
//
//            myEdit.putString("46", QuestionsList.EventBus);
//            myEdit.putString("47", QuestionsList.NotificationListnerService);
//            myEdit.putString("48", QuestionsList.LaunchModes);
//            myEdit.putString("49", QuestionsList.IntentFlags);
//            myEdit.putString("50", QuestionsList.Parceable);
//
//            myEdit.putString("51", QuestionsList.ProductFlavours);
//            myEdit.putString("52", QuestionsList.LiveData);
//            myEdit.putString("53", QuestionsList.SharedPrefrences);
//            myEdit.putString("54", QuestionsList.Databinding);
//            myEdit.putString("55", QuestionsList.FCM);
//            myEdit.putString("56", QuestionsList.Fragment_add_replace);
//            myEdit.putString("57", QuestionsList.addBackToStack);



            myEdit.apply();

        }catch (Exception e)
        {
            e.printStackTrace();
            Log.d("SharedPrefUtility","error catch block");
        }

    }


}
