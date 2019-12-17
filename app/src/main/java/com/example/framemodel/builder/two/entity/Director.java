package com.example.framemodel.builder.two.entity;

public class Director {
    Builder mBuilser = null;

    public Director(Builder builer) {
        this.mBuilser = builer;
    }

    public void construct() {
        mBuilser.buildDisplay("ab")
                .buildBoard("cd")
                .buildOs();
    }
}
