package com.gao.test;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午3:25
 */
public class StringTest {

    public static final String MONDAY = "monday";
    public static final String TUESDAY = "tuesday";
    public static final String FIRDAY = "firday";

    public static void main(String[] args) {
        /**
         *
         */
        char ch = 'd';
        String variable = "the character is ";
        String prefix = variable;
        switch (ch) {
            case 'a':
                print(ch, prefix);
                break;
            case 'b':
                System.out.println(prefix + ch + " b case");
                break;
            default:
                System.out.println("there is not any case apply");
                break;
        }


        String str = "monday";
        String first = "today is ";
        switch (str) {
            case MONDAY:
                print(first, str);
                break;
            case TUESDAY:
                print(first, str);
                break;
            case FIRDAY:
                print(first, str);
                break;
            default:
                String strs = "there is not any suitable day";
                System.out.println(strs);
                break;
        }


        Day day = Day.Friday;
        switch (day.getKey()){
            case "monday":
                print(prefix ,day.getKey());
                break;
            case "tuesday":
                print(prefix,day.getKey());
                break;
            case "firday":
                print(prefix,day.getKey());
                break;
            default:
                System.out.println("this is a default case");
                break;
        }
    }

    private static void print(char ch, String prefix) {
        System.out.println(prefix + ch + " a case!");
    }

    public static void print(String str1, String str2) {
        System.out.println(str1 + str2);
    }
}

enum Day {
    Monday(1, "monday"),
    Tuesday(2, "tuesday"),
    Friday(3, "firday");

    private int num;
    private String key;

    Day(int num, String key) {
        this.key = key;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getKey() {
        return key;
    }
}
