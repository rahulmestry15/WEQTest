package com.technologies.android.weq.weqtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.technologies.android.weq.myutils.MyMaths;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a=MyMaths.add2(1,2);
        Toast toast = Toast.makeText(getApplicationContext(), "sum "+a, Toast.LENGTH_LONG);
        toast.show();
    }
}
