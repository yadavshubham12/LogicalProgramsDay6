package com.bridgelabz.logicalstatement;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Reverse Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverseNo = 0;
        while ( number != 0){
           int remainder = number % 10;
           reverseNo = reverseNo * 10 + remainder;
           number = number / 10;
            System.out.println(reverseNo);

        }
    }
}
