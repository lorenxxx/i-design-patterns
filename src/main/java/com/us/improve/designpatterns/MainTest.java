package com.us.improve.designpatterns;

import java.math.BigDecimal;

/**
 * @author liangliang
 * @date 2018/11/5 10:33 PM
 */
public class MainTest {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("-1.03");
        BigDecimal b2 = new BigDecimal("0.1");
        BigDecimal b3 = new BigDecimal(0.03);

        BigDecimal ret = null;
        ret = b1.add(b2);
        ret = b1.subtract(b2);
        ret = b1.multiply(b2);
        ret = b1.divide(b2);
        System.out.println(ret);
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.signum());
        System.out.println(b3);
        System.out.println(b1.doubleValue());
        System.out.println(b1.intValue());
        System.out.println(b1.longValue());
    }

}
