package java_interview_program;
/***
 * Author: Mahadev Bhumbar
 *  1. Write a program to find out Factorial Number
 *
 */

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact*i;

        }
        return  fact;

    }
}
