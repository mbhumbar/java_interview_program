package java_interview_program;

import java.util.Scanner;

/***
 * @author : Mahadev Bhumbar
 * 4. Write a program to find out given no is armstrong number or not
 * logic: What is Armstrong Number ?
 * the given no sepeate digit cube addtion should be equal to given no
 * 153 is armstrong number becuase (1)^3 + (5)^3 + (3)^3 = 153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int c=0,a,temp,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number");
        n = sc.nextInt();
        temp = n;
        while (n>0) {
            a = n %10;
            n = n/10;
            c = c + (a*a*a);

        }
        if(temp == c) {
            System.out.println("the given no is armstrong number");
        }
        else {
            System.out.println("the given no is not armstrong number");
        }

    }
}
