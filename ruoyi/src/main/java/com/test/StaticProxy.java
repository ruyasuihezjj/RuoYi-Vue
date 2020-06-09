package com.test;

/**
 *
 *
 */
public class StaticProxy {
    public static void main(String[] args) {

        You you = new You();
        WeddingCom weddingCom = new WeddingCom(you);
        weddingCom.happyMarry();
    }
}

interface Marry{
    void happyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("你和嫦娥奔月去了");
    }
}

//代理角色
class WeddingCom implements Marry{
    //真实角色
    private Marry target;

    public WeddingCom(Marry target){
        this.target = target;
    }
    @Override
    public void happyMarry() {
        ready();
        this.target=target;
        after();
    }

    private void ready(){
        System.out.println("布置猪窝");
    }

    private void after(){
        System.out.println("闹洞房");
    }
}