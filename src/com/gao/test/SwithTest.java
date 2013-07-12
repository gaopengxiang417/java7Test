package com.gao.test;

import java.util.ArrayList;
import java.util.List;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 上午9:39
 */
public class SwithTest {
    public static void main(String[] args) {
        String str = "more bitch";
        switch (str){
            case "china":
                System.out.println("I love iit");
                break;
            case "more bitch":
                System.out.println("OK,thanks");
                break;
            default:
                System.out.println("this is a default case");
                break;
        }
    }
}
