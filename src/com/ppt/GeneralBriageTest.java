package ppt;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * User: wangchen
 * Date: 12/5/7
 * Time: 23:40
 */
public class GeneralBriageTest {

    public static void main(String[] args) {
        LinkedList<NumericValue> numberList = new LinkedList<> ();
        numberList .add(new NumericValue((byte)0));
        numberList .add(new NumericValue((byte)1));
        NumericValue y = Collections.max(numberList);

        NumericValue numericValue = numberList.get(0);
        Method[] declaredMethods = numericValue.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType() + ":" + declaredMethod.getParameterTypes()[0]);
        }
    }

}

final class NumericValue implements Comparable<NumericValue> {
    private byte value;
    public  NumericValue (byte value) { this.value = value; }
    public  byte getValue() { return value; }
    public  int compareTo( NumericValue that) { return this.value - that.value; }
}

class Collections {
    public static <A extends Comparable<A>>A max(Collection<A> xs) {
        Iterator<A> xi = xs.iterator();
        A w = xi.next();
        while (xi.hasNext()) {
            A x = xi.next();
            if (w.compareTo(x) < 0) w = x;
        }
        return w;
    }
}
