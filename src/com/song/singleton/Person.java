package com.song.singleton;

import java.security.Key;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 每个人都是单例的
 * @Date 2018/8/1/001
 */
public class Person {

    private static Person person = null;

    //私有构造方法，确保实体不能被new出来
    private Person() {
    }

    // TODO: 2018/8/1/001 构造方式有很多种
    public static Person getPerson() {
        if (person == null) {
            return new Person();
        }
        return person;
    }

    public void say() {
        System.out.println("人民---------说话");
    }

}
