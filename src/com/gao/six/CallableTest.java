package com.gao.six;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

/**
 * User: gaopengxiang
 * Date: 12-4-1
 * Time: 下午3:50
 */
public class CallableTest {
    public static void main(String[] args) throws Exception {
        BigDecimal salary = BigDecimal.valueOf(23.23);
        final Student student = new Student("gao",22, salary);
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return student.toString();
            }
        };

        String result = callable.call();
        System.out.println(result);
    }
}
class Student{
    private String name;
    private int age;
    private BigDecimal salary;

    Student(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
