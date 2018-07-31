package com.song.strategy;

public class Run {

    public static void main(String[] args) {
        Content content;

        //进行购买策略
        content = new Content(new Buy());
        content.operate();


        //进行学习策略
        content = new Content(new Study());
        content.operate();
    }

}
