package com.example.framemodel.builder.one.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.framemodel.R;
import com.example.framemodel.builder.one.entity.Student;

public class TestBuilderActivity extends AppCompatActivity {
    TextView tv_builder_display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        tv_builder_display = findViewById(R.id.tv_builder_display);
        Student.Builder builder = new Student.Builder();
        Student student = builder.setName("zhang san").setAge(20).setSex("boy").create();
        builder.setAge(12);
        String temp = student.toString();
        tv_builder_display.setText(temp);
    }
}
