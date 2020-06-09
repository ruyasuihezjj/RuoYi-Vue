package com.test;

public class StartThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<2000;i++){
            System.out.println("我要玩游戏");
        }
    }
    public static void main(String[] args) {
        StartThread startThread = new StartThread();
        startThread.start();
        for(int i=0;i<2000;i++){
            System.out.println("我要喝水");
        }

    }
}


