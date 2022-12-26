package com.bridgelabz.logicalstatement;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 4;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series"   +n);
        for (int i = 1; i <=n; i++){
            System.out.println(firstTerm + "  ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
