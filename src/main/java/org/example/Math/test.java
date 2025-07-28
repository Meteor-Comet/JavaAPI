package org.example.Math;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = sc.nextInt();
        for(int i = 0; i < Math.sqrt(n); i++){
            if (n % i == 0){
                System.out.println("不是素数");
                return;
            }
        }
        System.out.println("是素数");
        return;
    }
}
