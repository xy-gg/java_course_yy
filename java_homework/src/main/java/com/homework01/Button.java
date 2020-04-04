package com.homework01;

public class Button {
    private String name;
    private Clickable clickable;

    public Button(String name) {
        this.name = name ;
    }

    public void setButton(Clickable clickable) {
        this.clickable = clickable;
    }

    public Clickable getButton() {
        return clickable;
    }
}
