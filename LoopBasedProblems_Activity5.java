package Java_with_Wipro;

// Design an algorithm which accepts a number from the user and displays its smallest exact divisor other than one.

import java.util.*;

public class LoopBasedProblems_Activity5 {
    public static void main(String[] args) {
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :  ");
        int number = sc.nextInt();
        int smallest_exact_divisor;

        // Calculation
        for (smallest_exact_divisor = 2; smallest_exact_divisor <= number; smallest_exact_divisor++) {
            if (number % smallest_exact_divisor == 0) break;
        }
        System.out.println(smallest_exact_divisor);
    }
}
