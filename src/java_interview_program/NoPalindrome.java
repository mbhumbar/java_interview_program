package java_interview_program;

import java.util.Scanner;

/**
 * @author  : Mahadev Bhumbar
 * 8. Write a program to check given no is palindrome or not
 * input : 121
 * output : 121
 * that means given input is palindrome no
 * palindrome no menas given no is eqaul to output no
 */
public class NoPalindrome {
    public static void main(String[] args) {
        int n,temp,rev=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        temp = n;
        while(n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(temp == rev) {
            System.out.println("given no is palindrome");
        }
        else {
            System.out.println("Given no is not palindrome no");
        }
    }
}
