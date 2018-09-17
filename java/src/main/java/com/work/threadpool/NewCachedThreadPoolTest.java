package com.work.threadpool;

import java.util.concurrent.*;

public class NewCachedThreadPoolTest {

    public static void main(String[] args) {
        ArrayBlockingQueue b = new ArrayBlockingQueue(10);


        LinkedBlockingQueue a = new LinkedBlockingQueue();
        try {
            a.put("a");
            Object object = a.take();
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
