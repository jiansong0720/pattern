package com.song.proxy;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 助理工作
 * @Date 2018/8/1/001
 */
public class AssistantWork implements Work {

    private Work work;

    public AssistantWork() {
        this.work = new ActorAWork();
    }

    public AssistantWork(Work work) {
        this.work = work;
    }

    @Override
    public void acting() {
        //看似是助理在工作，实际执行的是演员
        System.out.println("助理---------工作移交给实际执行人");
        work.acting();
    }
}
