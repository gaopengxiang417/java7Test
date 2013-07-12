package com.gao.test;

import javax.naming.ConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午7:34
 */
public class ExceptionHandingTest {
    public static void main(String[] args) {

    }

    public static void firstMethod() {
        try {

            secondException();
        } catch (FileNotFoundException | ParseException | ConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void secondException() throws FileNotFoundException, IOException, ConfigurationException, ParseException {

        return;
    }

    public static  void methodSQLException() throws SQLException{

    }

    public static void methodIoException() throws  IOException{

    }
    public static  void invokeMethod(){

        try {
            methodIoException();
            methodSQLException();
        } catch (final SQLException | IOException e) {
            System.out.println("china");

            throw new MyException(e,e.getMessage());
        }

    }
}
class MyException extends RuntimeException{
    public MyException(String message){
        super(message);
    }
    public MyException(Throwable e,String message){
        super(message,e);
    }
}
