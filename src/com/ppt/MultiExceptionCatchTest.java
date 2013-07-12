package com.ppt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.sql.SQLException;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午7:34
 */
public class MultiExceptionCatchTest {
    public static void main(String[] args) {

        try {
            methodSQLException();
            methodIoException();
        } catch ( final SQLException | IOException e) {
            System.out.println(e.getClass());
        }
    }

    public static void methodSQLException() throws SQLException {
        throw new SQLException("sql test exception");
    }

    public static void methodIoException() throws IOException {
        throw new IOException("io test exception");
    }
}

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable e, String message) {
        super(message, e);
    }
}
