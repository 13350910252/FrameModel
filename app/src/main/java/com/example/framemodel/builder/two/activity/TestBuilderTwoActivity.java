package com.example.framemodel.builder.two.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.framemodel.R;
import com.example.framemodel.builder.two.entity.Builder;
import com.example.framemodel.builder.two.entity.Computer;
import com.example.framemodel.builder.two.entity.Director;
import com.example.framemodel.builder.two.entity.MacBookBuilder;

public class TestBuilderTwoActivity extends AppCompatActivity {
    TextView tv_builder_display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        tv_builder_display = findViewById(R.id.tv_builder_display);
        MacBookBuilder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
