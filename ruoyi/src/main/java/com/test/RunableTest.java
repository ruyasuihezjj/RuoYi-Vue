package com.test;

public class RunableTest implements Runnable{
    private int ticket = 5;


    @Override
    public void run() {
        for (int i = 0;i<50;i++){
            System.out.println("ticket===="+"---->"+this.ticket--);
        }

    }
}




