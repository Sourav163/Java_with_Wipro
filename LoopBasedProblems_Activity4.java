package Java_with_Wipro;

// Design an algorithm which accepts a binary representation of a number and then displays its corresponding decimal equivalent.

import java.util.*;

public class LoopBasedProblems_Activity4 {
    public static void main(String[] args) {
        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Representation :  ");
        int binary_representation = sc.nextInt();
        int temp = binary_representation;

        // Declaring list to store binary digits
        ArrayList<Integer> binary_digits = new ArrayList<>();

        // Case for binary representation 0
        if (temp == 0) binary_digits.add(0);

        // Storing binary digits to the declared list
        while (temp > 0) {
            binary_digits.add(temp % 10);
            temp /= 10;
        }

        // Reversing the list to get the binary representation in order
        Collections.reverse(binary_digits);

        // Conversion process (Binary --> Decimal)
        int decimal_integer = 0;
        for (int index = 0; index < binary_digits.size(); index++) {
            decimal_integer += (int) (binary_digits.get(index) * Math.pow(2, binary_digits.size() - 1 - index));
        }
        System.out.println("Decimal(" + binary_representation + ") = " + decimal_integer);

        sc.close();
    }
}
