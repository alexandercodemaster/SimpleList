package com.alexander.simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plList = findViewById(R.id.tv_pl_names);

        String[] names = {"Java", "Python", "Ruby", "JavaScript", "Groovy", "C", "C++", "Objective C",
                "Swift", "Haskel", "Scala", "Html", "CSS", "Matlab"};

        plList.setText("");

        for (String name : names) {
            plList.append(name + "\n");
        }
    }
}