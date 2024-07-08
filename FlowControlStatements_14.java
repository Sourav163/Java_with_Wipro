package Java_with_Wipro;

// Write a program to print the sum of all the digits of a given number.
// Example-1 :
//     I/P: 1234
//     O/P: 10

import java.util.*;

public class FlowControlStatements_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        int temp = num;
        int digit_sum = 0;
        while (temp > 0) {
            digit_sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits :  " + digit_sum);
    }
}
