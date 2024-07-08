package Java_with_Wipro;

// Write a program to check if a given number is prime or not.

import java.util.*;

public class FlowControlStatements_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        int temp = num - 1;
        int divisor_count;
        while (temp > 1) {
            if (num % temp == 0) {
                System.out.println(num + " is not a prime number");
                System.exit(0);
            }
            temp -= 1;
        }
        System.out.println(num + " is a prime number");
    }
}
