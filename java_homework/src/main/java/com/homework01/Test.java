package com.homework01;

import java.util.zip.DeflaterOutputStream;

public class Test {
    public static void main(String[] args) {
        Button button1 = new Button("ButtonA");
        button1.setButton(new Clickable() {
            public void click() {
                System.out.println("打印ButtonA");
            }
        });
        button1.getButton().click();

        Button button2 = new Button("ButtonB");
        button2.setButton(new Clickable() {
            public void click() {
                System.out.println("打印ButtonB");
            }
        });
        button2.getButton().click();
    }
}
