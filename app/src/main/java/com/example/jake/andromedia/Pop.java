package com.example.jake.andromedia;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Jakey on 21/04/2017.
 */

public class Pop extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_popup);

        //Gets the width and height of the screen resolution being used.
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));

        TextView tx = (TextView)findViewById(R.id.Paragraph_1_PU);
        TextView tx2 = (TextView)findViewById(R.id.Paragraph_2_PU);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/chalkmars_regular_sample.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);
    }
}
