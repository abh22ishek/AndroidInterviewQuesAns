package com.example.androidstudytutorial.listners;

import com.example.androidstudytutorial.model.Descx;

import java.util.List;

public interface CallFragment {
    void showFragment(List<Descx> dList,int pos, String key , String value);
}
