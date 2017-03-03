package ppt;

/**
 * User: wangchen.gpx
 * Date: 13-7-10
 * Time: 上午12:27
 */
public class Son extends ppt.Father {
    //这里我们覆盖了父类的两个方法

    @Override
    Object getValue() {
        return 23;
    }

    @Override
    void setValue(Object value) {

    }
}
