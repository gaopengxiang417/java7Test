package com.gao.four;

/**
 * User: gaopengxiang
 * Date: 12-3-31
 * Time: 下午8:26
 */
public class DeadMethod {
    private final String name ;

    public DeadMethod(String name) {
        this.name = name;
    }

    public synchronized void methodOne(DeadMethod deadMethod){
        System.out.println(this.name + " :start methodOne:" + deadMethod.getName());
        deadMethod.methodTwo(this);
        System.out.println(this.name+" :end methodOne:"+deadMethod.getName());
    }

    public synchronized  void methodTwo(DeadMethod deadMethod){
        System.out.println(this.name + " :start methodTwo:" + deadMethod.getName());
        deadMethod.methodOne(this);
        System.out.println(this.name+" :end methodTwo:"+deadMethod.getName());
    }
    public String getName() {
        return name;
    }
}
