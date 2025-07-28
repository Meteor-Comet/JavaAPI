package org.example.Math;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入数字:");
//        int n = in.nextInt();
        for(int i = 0; i < 1000; i++){
            judge(i);
        }
    }

    public static void judge(int n) {
        int temp = n;
        int count = 0;
        while(temp != 0){
            temp/=10;
            count++;
        }
        temp = n;
        int sum = 0;
        while(temp > 0){
            sum = sum+ (int) Math.pow(temp % 10, count);
            temp /= 10;
        }
        if(sum == n){
            System.out.println(n+"是自幂数");
        }
    }
}
