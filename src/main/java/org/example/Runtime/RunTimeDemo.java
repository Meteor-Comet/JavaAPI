package org.example.Runtime;

import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1==r2);
//
//        Runtime.getRuntime().exit(0);
//        System.out.println("程序已退出");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        Runtime.getRuntime().exec("dir");
    }
}
