package Java_with_Wipro;

// Design an algorithm which accepts a decimal integer and then displays its corresponding binary representation.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LoopBasedProblems_Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter Decimal Integer :  ");
        int decimal_integer = sc.nextInt();
        int temp = decimal_integer;

        // List to store binary digits
        ArrayList<Integer> binary_digits = new ArrayList<>();

        // Edge case for zero
        if (temp == 0) binary_digits.add(0);

        // Conversion process
        while (temp > 0) {
            binary_digits.add(temp % 2);
            temp /= 2;
        }

        // Reverse the list to get the correct binary representation
        Collections.reverse(binary_digits);

        // Storing to a variable
        int binary_representation = 0;
        for (int binary_digit : binary_digits) {
            binary_representation = binary_representation * 10 + binary_digit;
        }

        // Displaying the binary representation
        System.out.println("Binary(" + decimal_integer + ") = " + binary_representation);

        sc.close();
    }
}
