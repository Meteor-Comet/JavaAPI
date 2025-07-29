package org.example.regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "123456789";
        boolean b = qq.matches("[1-9]\\d{5,10}");
        System.out.println(b);
    }
}
