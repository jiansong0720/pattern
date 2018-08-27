package com.song.strategy;

/**
  * @Author zhangmingsong@9lead.com
  * @Describe 学习策略
  * @Date 2018/8/1/001
  */
public class Study implements IStrategy{

    @Override
    public void operate() {
        System.out.println("学习--------策略执行");
    }

}