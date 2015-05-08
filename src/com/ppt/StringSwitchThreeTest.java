package ppt;

/**
 * User: wangchen
 * Date: 15/5/7
 * Time: 23:08
 */
public class StringSwitchThreeTest {
    public static void main(String[] args) {

        int a = 5;
        int result = 0;
        switch (a) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 2;
                break;
            case 3:
                result = 3;
                break;
            case 4:
                result = 4;
                break;
            case 5:
                result = 5;
                break;
            default:
                result = -1;
        }

        System.out.println(result);
    }
}
