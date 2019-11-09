package com.huanglei.wf2.test;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java9FlowTest {
    private static int i;

    public static void main(String[] args) {

        /*
            创建对象的方式
         */
        Supplier<Object> supplier = Object::new;

        /*
            调用方法的方式(无参数)
         */
        Runnable runnable = Java9FlowTest::add;

        /*
            调用方法的方式(有参数)
         */
        Predicate<String> predicate = Java9FlowTest::filter;
    }

    public static void add() {
        i++;
        System.out.println("test" + i);
    }

    public static boolean filter(String test) {
        return test != null;
    }
}
