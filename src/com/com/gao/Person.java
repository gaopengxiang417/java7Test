package com.gao;

import java.io.Serializable;

/**
 * User: wangchen
 * Date: 2017/3/3
 * Time: 09:29
 *
 * @author wangchen
 * @date 2017/03/03
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 8943559589290907524L;

    //private static final int test = 1;

    private int age;
    private String sex;
    private String name;
    private String hobby;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
