package ppt;

import java.util.Date;

/**
 * User: wangchen.gpx
 * Date: 13-7-12
 * Time: 下午3:50
 */
public class TowSecond extends Father<Date> {
    @Override
    Date getValue() {
        return new Date();
    }

    @Override
    void setValue(Date value) {
        //
    }
}
