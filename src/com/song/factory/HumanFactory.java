package com.song.factory;

/**
 * @Author zhangmingsong@9lead.com
 * @Describe 人类工厂
 * @Date 2018/8/1/001
 */
public class HumanFactory {

    /**
     * 创建人方法
     *
     * @param clazz 类对象
     * @return 人对象
     */
    public static Human createMan(Class clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("工厂-----------创建人错误");
        }
        return human;
    }

}
