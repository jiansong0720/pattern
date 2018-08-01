package com.song.facade;

public class LetterProcessImpl implements LetterProcess {

    @Override
    public void context(String context) {
        System.out.println("信件发送内容----------" + context);
    }

    @Override
    public void address(String address) {
        System.out.println("信件发送地址----------" + address);
    }

    @Override
    public void send() {
        System.out.println("信件发送");
    }

}
