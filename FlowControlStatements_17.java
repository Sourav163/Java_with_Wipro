package Java_with_Wipro;

// Write a Java program to find if the given number is palindrome or not
// Example-1 :
//     C: Sample 110011
//     O/P: 110011 is a palindrome
// Example-2 :
//     C: Sample 1234
//     O/P: 1234 is not a palindrome

import java.util.*;

public class FlowControlStatements_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        int temp = num;
        int reverse_num = 0;
        while (temp > 0) {
            reverse_num = reverse_num * 10 + temp % 10;
            temp /= 10;
        }
        if (num == reverse_num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
