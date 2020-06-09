package com.test;

public class threadTest{
    public static void main(String[] args) {
        Test testA  = new Test("ThtradAAAA");
        Test testB  = new Test("ThtradBBBB");
        Test testC  = new Test("ThtradCCCC");
        testA.start();
        testB.start();
        testC.start();

    }

}

class Test extends Thread{

    private String name;

    public Test(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(this.name+"---->"+i);
        }

    }
}
