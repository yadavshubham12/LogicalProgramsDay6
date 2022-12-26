package com.bridgelabz.logicalstatement;

import java.util.Scanner;

public class StopWatchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start;
        long stop;
        double time;
        System.out.println("Type any character to start stopwatch");
        char s = scanner.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("Type any character to stop stopwatch");
        char e = scanner.next().charAt(0);
        stop = System.currentTimeMillis();
        time = (stop - start)/1000.0;
        System.out.println(time);


    }
}
