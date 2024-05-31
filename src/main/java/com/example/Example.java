// src/main/java/com/example/Example.java
package com.example;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var e = new Example();
        e.doNothing();

    }

    public Example() {
    }

    public void doNothing() {
        System.out.println("doing nothing");
    }
}
