package org.example.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入1-100数字:");
            String s = sc.nextLine();
            int n = Integer.parseInt(s);
            if (n < 1 || n > 100) {
                System.out.println("输入超出范围");
                continue;
            }
            list.add(n);
            if (sum(list) > 200) {
                System.out.println("和超出200");
                break;
            }
        }
        System.out.println(list);
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
