package com.ppt;

import java.io.*;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午8:22
 */
public class TryReourceTest {
    public static void main(String[] args) {

    }

    public static void tryWithReource(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("kcin");
            FileInputStream fileInputStream = new FileInputStream("china")){

            //do somethings
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void oldFormTry(){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(new File("location"));

            fileOutputStream = new FileOutputStream(new File("location"));
            int s;
            byte[] buff = new byte[1024];
            while((s = fileInputStream.read()) != -1){
                fileOutputStream.write(buff,0,s);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
