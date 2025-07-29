package org.example.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
