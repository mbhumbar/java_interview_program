package java_interview_program;

import java.util.Scanner;

/***
 * @author  : Mahadev Bhumbar
 * 7. wrire a program to findout given no is prime or not
 * the prime no means its divisble by iteself and 1.
 * prime no are : 1,2,5,3,5,11,13,17
 */
public class PrimeNoExample {
    public static void main(String[] args) {
        int n,i,count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = sc.nextInt();
        for(i=0;i<=n;i++) {
            if(i%n == 0) {
                count+=1;
            }
        }
        if (count == 2) {
            System.out.println("Given no is prime no");
        }
        else {
            System.out.println("given no is not prime no");
        }

    }
}
