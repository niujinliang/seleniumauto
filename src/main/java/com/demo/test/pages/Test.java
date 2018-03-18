package com.demo.test.pages;

/**
 * Created by niujinliang on 2018/2/5.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for(int i =0; i<1000;i++){

            Thread.sleep(1000);
            System.out.println(i);
        }

    }
}
