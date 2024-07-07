package Java_with_Wipro;

// Initialize a character variable in a program and
// print 'Alphabet' if the initialized value is an alphabet,
// print 'Digit' if the initialized value is a number, and
// print 'Special Character' if the initialized value is anything else.

import java.util.*;

public class FlowControlStatements_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter :  ");
        char a = sc.next().charAt(0);
        String alphabets_and_digits = "abcdefghijklmnopqrstuvwxyz0123456789";
        int index;
        for (index = 0; index < alphabets_and_digits.length(); index++) {
            if (a == alphabets_and_digits.charAt(index)) {
                break;
            }
        }
        if (index < 26) {
            System.out.println("Alphabet");
        } else if (index == 36) {
            System.out.println("Special Character");
        } else {
            System.out.println("Digit");
        }
    }
}
