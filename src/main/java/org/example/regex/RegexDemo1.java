package org.example.regex;

import java.util.Scanner;

public class RegexDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String phoneNumber = in.next();
        String regex1 = "^1[3-9]\\d{9}$";
        boolean matches1 = phoneNumber.matches(regex1);
        System.out.println(matches1);

        System.out.println("请输入邮箱:");
        String email = in.next();
        String regex2 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        boolean matches2 = email.matches(regex2);
        System.out.println(matches2);
    }
}
