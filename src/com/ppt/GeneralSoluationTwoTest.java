package ppt;

import java.util.ArrayList;

/**
 * User: wangchen.gpx
 * Date: 13-7-9
 * Time: 下午11:39
 * 参数化类型和原始类型的兼容性，到底检查是针对谁
 */
public class GeneralSoluationTwoTest {
    public static void main(String[] args) {
        //几种写法
        //JDK5之前的写法
        ArrayList beforeList = new ArrayList();
        //JDK5中的写法
        ArrayList<String> jdk5List = new ArrayList<String>();
        //JDK7中的写法
        ArrayList<String> jdk7List = new ArrayList<>();

        ArrayList notExistList = new ArrayList<String>();


    }
}
