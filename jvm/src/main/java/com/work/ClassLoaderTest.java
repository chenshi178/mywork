package com.work;

public class ClassLoaderTest {


    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        loader.loadClass("com.work.Test2");



        Class.forName("com.work.Test2");


    }


}
