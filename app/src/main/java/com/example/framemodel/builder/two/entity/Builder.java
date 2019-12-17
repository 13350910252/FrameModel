package com.example.framemodel.builder.two.entity;

public abstract class Builder {
    public abstract Builder buildBoard(String board);

    public abstract Builder buildDisplay(String display);

    public abstract Builder buildOs();

    public abstract Computer build();
}
