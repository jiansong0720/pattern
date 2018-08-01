package com.song.strategy;

/**
  * @Author zhangmingsong@9lead.com
  * @Describe 购买策略
  * @Date 2018/8/1/001
  */
public class Buy implements IStrategy{

    @Override
    public void operate() {
        System.out.println("购买--------策略执行");
    }

}
