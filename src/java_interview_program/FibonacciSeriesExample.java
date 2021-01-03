package java_interview_program;
import java.util.Scanner;

/***
 * @author : Mahadev Bhumbar
 * 3. Write a program to display fibonacci series
 * fibonanci series Example : [0,1,1,2,3,5,8,13,21,34]
 * logic : result of previous to number store in 3rd verible
**/

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        int f1,f2=0,f3=1,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to display Fibonacci series ");
        n = sc.nextInt();
        for(i=0;i<=n;i++) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            System.out.print(" " + f3);
        }
    }
}
