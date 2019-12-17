package com.example.framemodel.builder.two.entity;

public class MacBookBuilder extends Builder {
    Computer computer = new MacBook();

    @Override
    public Builder buildBoard(String board) {
        computer.mBoard = board;
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        computer.mDisplay = display;
        return this;
    }

    @Override
    public Builder buildOs() {
        computer.setOs();
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
