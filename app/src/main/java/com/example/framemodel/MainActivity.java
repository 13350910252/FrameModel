package com.example.framemodel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.framemodel.builder.one.activity.TestBuilderActivity;
import com.example.framemodel.builder.two.activity.TestBuilderTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_builder = findViewById(R.id.btn_builder);

        btn_builder.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_builder:
                startActivity(new Intent(MainActivity.this, TestBuilderTwoActivity.class));
                break;
            default:
        }
    }
}
