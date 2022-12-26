package com.bridgelabz.logicalstatement;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Enter Number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for ( int i = 1; i <= n; i++){
            if (n % i == 0){
                sum++;
            }
        }
        if (sum == 2){
            System.out.println("number is Prime number");
        }
        else {
            System.out.println("number is not Prime number");

        }

    }
}
