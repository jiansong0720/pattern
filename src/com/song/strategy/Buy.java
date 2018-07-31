package com.song.strategy;

public class Buy implements IStrategy{

    @Override
    public void operate() {
        System.out.println("购买--------策略执行");
    }

}
