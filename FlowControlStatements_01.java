package Java_with_Wipro;

// A) Write a program to check if a given integer number is Positive, Negative, or Zero.
// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
//     lastDigit(7, 17) --> true
//     lastDigit(6, 17) --> false
//     lastDigit(3, 113) --> true

import java.util.*;

public class FlowControlStatements_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* A */
        System.out.print("Enter an integer number :  ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }

        /* B */
        System.out.print("Enter a non-negative integer value :  ");
        int non_negative_int_value1 = sc.nextInt();
        System.out.print("Enter another non-negative integer value :  ");
        int last_digit_of_value1 = non_negative_int_value1 % 10;
        int non_negative_int_value2 = sc.nextInt();
        int last_digit_of_value2 = non_negative_int_value2 % 10;
        if (last_digit_of_value1 == last_digit_of_value2) {
            System.out.println("Same Last Digit :  " + true);
        } else {
            System.out.println("Same Last Digit :  " + false);
        }

        sc.close();
    }
}
