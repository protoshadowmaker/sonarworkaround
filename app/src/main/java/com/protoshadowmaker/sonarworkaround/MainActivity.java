package com.protoshadowmaker.sonarworkaround;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Formatter formatter = new Formatter();
        TextView title = findViewById(R.id.title);
        title.setText(formatter.format("source text"));
    }
}