package com.song.factory;

/**
  * @Author zhangmingsong@9lead.com
  * @Describe 工厂模式
  * @Date 2018/8/1/001
  */
public class Run {

    public static void main(String[] args) {
        //创建男人
        Human man = HumanFactory.createMan(Man.class);
        man.smile();

        //创建女人
        Human woman = HumanFactory.createMan(Woman.class);
        woman.smile();
    }

}
