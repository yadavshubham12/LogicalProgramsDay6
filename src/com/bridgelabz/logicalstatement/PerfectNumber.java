package com.bridgelabz.logicalstatement;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
         int n;
         int sum = 0;
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         for ( int i = 1; i < n; i++){
             if (n % i == 0){
                 sum = sum + i;
             }
         }
             if (sum == n){
                 System.out.println("number is Perfect number");
             }
             else {
                 System.out.println("number is not Perfect number");

             }

    }
}
