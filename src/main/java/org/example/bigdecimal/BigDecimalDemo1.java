package org.example.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);
        //静态方法
        BigDecimal bd5 = BigDecimal.valueOf(0.01);
        System.out.println(bd5);
        //如果表示的数字没有超出double的范围，那么使用double
        //如果表示的数字超出double的范围，那么使用BigDecimal构造方法
        //如果我们传递的是0~10之间整数，方法会直接返回创建好的对象
        BigDecimal bd6 = BigDecimal.valueOf(6);
        BigDecimal bd7 = BigDecimal.valueOf(6);
        System.out.println(bd6==bd7);

        BigDecimal bd8 = new BigDecimal("10.0");
        BigDecimal bd9 = new BigDecimal("3.0");
        BigDecimal bd10 = bd8.divide(bd9,2, RoundingMode.HALF_UP);
        System.out.println(bd10);
    }
}
