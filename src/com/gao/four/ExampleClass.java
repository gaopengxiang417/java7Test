package com.gao.four;

import java.util.*;

/**
 * User: gaopengxiang
 * Date: 12-3-31
 * Time: 下午8:15
 */
public class ExampleClass {
    private final String name ;
    private final Map<String, Object> tempMap = new HashMap<>();

    public ExampleClass(String name) {
        this.name = name;
    }

    public synchronized void update(String key,Date value) {
        tempMap.put(key, value);
        return;
    }
    public synchronized Collection<Object> values(String key){
        return tempMap.values();
    }
    public String getName() {
        return name;
    }
}
