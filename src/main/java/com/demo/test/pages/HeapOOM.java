package com.demo.test.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * Created by niujinliang on 2018/2/5.
 */
public class HeapOOM {
    public static void main(String[] args) throws InterruptedException {
        int size = 1024*1024*8;

        List<byte[]> list = new ArrayList<byte[]>();

        for (int i=0;i<1024;i++){
            Thread.sleep(1000);
            list.add(new byte[size]);
        }
    }
}
