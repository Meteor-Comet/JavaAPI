package org.example.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("^0*");
        //去掉开头的0
        String s1 = pattern.matcher(s).replaceAll("");
        long num = 0;
        for (int i = 0; i < s1.length(); i++){
            num = num * 10 + s1.charAt(i) - '0';
        }
        System.out.println("转换后的数字为"+num);
    }
}
