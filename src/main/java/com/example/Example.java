package com.example;

public class Example {

    public static void main(String[] args) {
        final Example e = new Example();
        e.doNothing();
    }

    public Example() {
    }

    public void doNothing() {
        System.out.println("doing nothing");
    }

}
