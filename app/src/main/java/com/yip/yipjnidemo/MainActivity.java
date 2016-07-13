package com.yip.yipjnidemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {


    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView= (TextView) findViewById(R.id.txt_jnitext);
        JniText jniText=new JniText();
        txtView.setText(jniText.getCLangString());
    }
}
