package java_interview_program;

import java.util.Scanner;

/***
 * @author  : Mahadev Bhumbar
 * 5. write a program to print addition of digit no
 * input : 123456
 * output : 12345 = 1+2+3+4+5 = 15
 **/

public class AdditionOfDigitNo {
    public static void main(String[] args) {
        int rem = 0,sum=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        while(n>0) {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Addition of given number is :" + sum);
    }
}
