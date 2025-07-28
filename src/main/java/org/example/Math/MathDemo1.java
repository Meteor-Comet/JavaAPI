package org.example.Math;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2147483648));
        System.out.println(Math.abs(-2147483647));
        System.out.println(Math.ceil(20.1));
        System.out.println(Math.floor(20.1));
        System.out.println(Math.ceil(-20.1));
        System.out.println(Math.floor(-20.1));
        System.out.println(Math.round(20.5));
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(-20.51));
        System.out.println(Math.round(-20.4));

        System.out.println(Math.max(20, 10));
        System.out.println(Math.min(20, 10));

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.pow(2, -2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println("-------------------------");
        for(int i = 1; i <= 10; i++){
            //System.out.println((int)(Math.random()*100));
            System.out.println(Math.floor(Math.random()*100)+1);
        }
    }
}
