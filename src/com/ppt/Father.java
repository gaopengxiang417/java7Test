package ppt;

/**
 * User: wangchen.gpx
 * Date: 13-7-10
 * Time: 上午12:26
 */
public class Father<T> {
    private T value;

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

//编译以后的代码应该是
//Son 这个类中的两个方法应该是覆盖，但是现在看来根本不是覆盖，而是重载
class FatherAfterCompile{
    private Object value;

    Object getValue() {
        return value;
    }

    void setValue(Object value) {
        this.value = value;
    }
}
