package java_interview_program;

import java.util.Scanner;

/***
 * @author : Mahadev Bhumbar
 * 2. Write a program to find out factorial no using recursion method
 */

public class FactorialWithRecursion {

    private static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else
            return (n*factorial(n-1));
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial");
        n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("the factorial of " + n +  " is: " + fact);
    }


}
