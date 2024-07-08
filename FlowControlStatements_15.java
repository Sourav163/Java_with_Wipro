package Java_with_Wipro;

// Write a program to print * in Floyd's format (using for and while loop)
// *
// * *
// * * *
// Example-1 :
//     C:\> java Sample
//     O/P: Please enter an integer number
// Example-2 :
//     C:\> java Sample 3
//     O/P: *
//          * *
//          * * *

import java.util.*;

public class FlowControlStatements_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
