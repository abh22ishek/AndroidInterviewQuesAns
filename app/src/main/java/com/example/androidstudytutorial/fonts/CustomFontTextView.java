package com.example.androidstudytutorial.fonts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.example.androidstudytutorial.R;

public class CustomFontTextView extends androidx.appcompat.widget.AppCompatTextView {

    private final static int CENTRALESANS_XBOLD = 1;

    private final static int CENTRALSANS_LIGHT = 2;
    private final static int CENTRALSANS_BOOK = 3;

    private final static int AVANT_GARDE=4;
    private final static int AVANT_GAMI=5;


    String TYPEFACE_CENTRALSANS_XBOLD = "fonts/CentraleSans-XBold.otf";
    String TYPEFACE_CENTRALSANS_Light = "fonts/CentraleSans-Light.otf";
    String TYPEFACE_CENTRALSANS_BOOK = "fonts/CentraleSans-Book.otf";
    String TYPEFACE_AVANT_GARDE="fonts/ufonts.com_avantgarde.ttf";
    String TYPEFACE_AVANT_GAMI= "fonts/avangami.ttf";
    public CustomFontTextView(Context context) {
        super(context);
        init(context, null);
    }

    public CustomFontTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView);

        //The value 0 is a default, but shouldn't ever be used since the attr is an enum
        int typeface = values.getInt(R.styleable.CustomFontTextView_fontname, 1);
        switch (typeface) {

            case CENTRALESANS_XBOLD:
                //Typeface  centralSansXBold = Typeface.createFromAsset(context.getAssets(), "fonts/CentraleSans-XBold.otf");
                Typeface centralSansXBold = FontTYpeFace.getTypeFace(TYPEFACE_CENTRALSANS_XBOLD, context);
                setTypeface(centralSansXBold);
                break;


            case CENTRALSANS_LIGHT:
                Typeface centralSansLight = FontTYpeFace.getTypeFace(TYPEFACE_CENTRALSANS_Light, context);
                setTypeface(centralSansLight);
                break;

            case CENTRALSANS_BOOK:
                Typeface centralSansBook = FontTYpeFace.getTypeFace(TYPEFACE_CENTRALSANS_BOOK, context);
                setTypeface(centralSansBook);
                break;

            case AVANT_GARDE:
                Typeface avantgarde = FontTYpeFace.getTypeFace(TYPEFACE_AVANT_GARDE, context);
                setTypeface(avantgarde);
                break;


            case AVANT_GAMI:
                Typeface avangami = FontTYpeFace.getTypeFace(TYPEFACE_AVANT_GAMI, context);
                setTypeface(avangami);
                break;

        }

        values.recycle();

    }
}
