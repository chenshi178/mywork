package com.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {

    static private final byte message[] = {83, 111, 109, 101, 32, 98};


    public static void main(String[] args) throws Exception {

        String s = new String("abc");

        s = "abcabc";

        System.out.println(s.toString());


    }


}
