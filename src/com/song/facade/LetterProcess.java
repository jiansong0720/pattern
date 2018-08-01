package com.song.facade;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 定义写信过程
 * @Date 2018/8/1/001
 */
public interface LetterProcess {

    //编写信件内容
    public void context(String context);

    //编写收取地址
    public void address(String address);

    //发送信件
    public void send();

}
