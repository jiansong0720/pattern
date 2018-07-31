package com.song.strategy;

public class Study implements IStrategy{

    @Override
    public void operate() {
        System.out.println("学习--------策略执行");
    }

}
