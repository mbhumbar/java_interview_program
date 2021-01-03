package java_interview_program;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author : Mahadev Bhumbar
 * 6. Write a the program print the revers number
 * input : 12345
 * output : 54321
 */

public class ReverseNoProgram {

    public static void main(String[] args) {
        int n, rev=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        while (n>0)  {
            rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
       System.out.println("the reverse of given no is :" + rev);

    }
}
