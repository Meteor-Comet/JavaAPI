package org.example.System;

public class SystemDemo {
    public static void main(String[] args) {
//        System.exit(0);
//        System.out.println("程序已退出");

        long l = System.currentTimeMillis();
        System.out.println(l);
        for (int i = 0; i < 1000; i++){
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l+"毫秒");

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,6,arr2,2,3);
        for(int i:arr2){
            System.out.println(i);
        }
    }
}
