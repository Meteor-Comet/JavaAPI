package org.example.Test;

import java.util.Scanner;

public class TestDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int n = sc.nextInt();
        String s = "";
        while(n != 0){
            int a = n % 2;
            s = a + s;
            n = n / 2;
        }
        System.out.println(s);
    }
}
