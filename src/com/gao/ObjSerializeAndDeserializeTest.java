package gao;

import com.gao.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * User: wangchen
 * Date: 2017/3/3
 * Time: 09:36
 *
 * @author wangchen
 * @date 2017/03/03
 */
public class ObjSerializeAndDeserializeTest {

    public static void main(String[] args) {
        Person person = DeserializePerson();
        System.out.println("name :" + person.getName());
        System.out.println("age  :" + person.getAge());
    }

    private static Person DeserializePerson() {

        Person person = null;
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("/Users/wangchen/work/idea_workspace/java8Test/hello.txt"));
            try {
                person = (Person) inputStream.readObject();
                System.out.println("执行反序列化过程成功。");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return person;
    }
}
