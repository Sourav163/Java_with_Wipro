package Java_with_Wipro;

// Write a program to reverse a given number and print
// Example-1 :
//     I/P: 1234
//     O/P: 4321
// Example-2 :
//     I/P: 1004
//     O/P: 4001

import java.util.*;

public class FlowControlStatements_16 {
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
        System.out.println("Reversed number :  " + reverse_num);
    }
}
