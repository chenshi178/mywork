package com.work;

public class Method {


    public static <T> void test1(T t) {
        System.out.println(t);
    }


    public static <T> void test3(T... a) {
        for (T temp : a) {
            System.out.println(a.toString());
        }
    }


    public static void main(String[] args) {
        test3("a", "b", "c", "d");
    }

}
