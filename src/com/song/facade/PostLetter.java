package com.song.facade;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 邮件发送
 * @Date 2018/8/1/001
 */
public class PostLetter {

    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        letterProcess.context(context);
        letterProcess.address(address);
        letterProcess.send();
    }

}
