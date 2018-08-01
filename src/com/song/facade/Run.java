package com.song.facade;

/**
  * @Author zhangmingsong@9lead.com
  * @Describe 门面模式（外观模式）
  * @Date 2018/8/1/001
  */
public class Run {

    public static void main(String[] args) {
        PostLetter postLetter=new PostLetter();
        postLetter.sendLetter("我爱你","18227624289@163.com");
    }

}
