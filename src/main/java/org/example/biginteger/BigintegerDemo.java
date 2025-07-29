package org.example.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigintegerDemo {
    public static void main(String[] args) {
        Random r  = new Random();
        //获取随机大整数,范围0-2^4
        BigInteger bd1 = new BigInteger(4, r);
        System.out.println(bd1);
        //获取指定大整数
        BigInteger bd2 = new BigInteger("1234567890123456789012345678901234567890");
        System.out.println(bd2);
        //获取指定进制整数
        BigInteger bd3 = new BigInteger("100",2);
        System.out.println(bd3);
        //静态方法获取biginteger的对象
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);
        //内部优化-16~16
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);


    }
}
