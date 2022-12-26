package com.bridgelabz.logicalstatement;

public class CouponNumber {
    public static void main(String[] args) {

        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDx1234568".toCharArray();
        int max = 100000000;
        int random = (int)(Math.random()*max);
        StringBuffer sb = new StringBuffer();

        while (random > 0){
            sb.append((chars[random % chars.length]));
            random /= chars.length;
        }
        String couponCode = sb.toString();
        System.out.println("coupon Code: " +couponCode);

    }
}
