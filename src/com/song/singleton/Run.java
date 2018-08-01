package com.song.singleton;

/**
  * @Author zhangmingsong@9lead.com
  * @Describe 单例模式
  * @Date 2018/8/1/001
  */
public class Run {

    public static void main(String[] args) {
        //第一次人说话
        Person person1 = Person.getPerson();
        person1.say();

        //第二次人说话
        Person person2 = Person.getPerson();
        person2.say();
    }

}
