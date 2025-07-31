package org.example.Integet;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        Integer i5 = 129;
        int i6 = 129;
        System.out.println(i5 == i6);

        System.out.println(Integer.toBinaryString(10));
    }
}
