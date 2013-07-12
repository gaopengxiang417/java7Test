package com.gao;

/**
 * User: wangchen.gpx
 * Date: 13-6-26
 * Time: 上午11:12
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "sdfsdfsdf</br>werwrewre";
        String kk = str.replaceAll("</br>", "KK");
        System.out.println(kk);
    }
}
