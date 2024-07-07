package Java_with_Wipro;

// Initialize two character variables in a program and display the characters in alphabetical order.
// Example-1: if the first character is 's' and second character is 'e' then the output should be e, s
// Example-2: if the first character is 'a' and second character is 'e' then the output should be a, e

import java.util.*;

public class FlowControlStatements_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter :  ");
        char a = sc.next().toLowerCase().charAt(0);
        System.out.print("Enter another letter :  ");
        char b = sc.next().toLowerCase().charAt(0);
        if (a < b) {
            System.out.println(a + ", " + b);
        } else {
            System.out.println(b + ", " + a);
        }
    }
}
