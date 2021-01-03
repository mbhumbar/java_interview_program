package java_interview_program;

import java.util.Scanner;

/**
 * @author : Mahadev Bhumbar
 * 8. Write a program to check given year is leap year or not
 */

public class LeadYearProgram {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if((year % 4 == 0 ) && (year % 100!=0) || (year % 400 == 0)) {
            System.out.println("Given year is leap year");
        }
        else {
            System.out.println("Given year is not leap year");
        }
    }
}
