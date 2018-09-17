package com.work;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test2 {


    public static void main(String[] args) throws Exception {


        Lock lock = new ReentrantLock();

        lock.lock();

        lock.unlock();

        AbstractQueuedSynchronizer a = null;


        Thread thread = new Thread();


    }


}
