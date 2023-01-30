package com.example.androidstudytutorial.fonts;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class FontTYpeFace {


    private static HashMap<String, Typeface> font_cache=new HashMap<>();

    static Typeface getTypeFace(String font_name, Context context) {
        // fontaname is path
        Typeface typeface = font_cache.get(font_name);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), font_name);
            } catch (Exception e) {
                return null;
            }
            font_cache.put(font_name, typeface);
        }
        return typeface;
    }

}
