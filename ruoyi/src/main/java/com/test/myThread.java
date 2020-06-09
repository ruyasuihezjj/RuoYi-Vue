package com.test;

public class myThread {
    public static void main(String[] args) {
        RunableTest runableTestA = new RunableTest();
        new Thread(runableTestA).start();
        new Thread(runableTestA).start();
        new Thread(runableTestA).start();
    }
}
