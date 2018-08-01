package com.song.proxy;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 代理模式
 * @Date 2018/8/1/001
 */
public class Run {

    public static void main(String[] args) {
        //先让演员A工作
        AssistantWork assistantWork = new AssistantWork();
        assistantWork.acting();

        //演员A累了，让演员B工作一会儿
        assistantWork = new AssistantWork(new ActorBWork());
        assistantWork.acting();
    }

//    简单代理模式中，代理类知道被代理类的行为，因为代理类与被代理类实现的是同一个接口，因此代理类与被代理类的结构是相同的；
//    而策略模式中，策略容器并不知道内部策略的详细信息，因为容器并没有实现与内部策略相同的接口，即容器与内部策略只是简单的组合关系，容器只是将内部策略的行为抽取出来，进行了统一的实现。

}
