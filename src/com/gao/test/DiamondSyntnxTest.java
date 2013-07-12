package com.gao.test;

import java.util.*;

/**
 * User: gaopengxiang
 * Date: 12-3-29
 * Time: 下午8:43
 */
public class DiamondSyntnxTest {
    public static void main(String[] args) {
        Map<String,Map<String,Date>> student = new HashMap<>();

        Map<Integer,String> second = new TreeMap<>();
        second.put(12,"china");
        second.put(33,"sends");

        Set<Integer> keys = second.keySet();
        for (Iterator<Integer> iterator = keys.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            System.out.println(next +":"+second.get(next));

        }
        first(new ArrayList<String>());

    }
    @SafeVarargs
    public static  void first(List<String> ... vargs/*use to*/){

        System.out.println(vargs.length);
    }
}
