package Java_with_Wipro;

// Initialize a character variable with an alphabet in a program.
// If the character value is in lowercase, the output should be displayed in uppercase in the following format.
// Example-1 :
//     i/p: a
//     o/p: a->A
// If the character value is in uppercase, the output should be displayed in lowercase in the following format.
// Example-2 :
//     i/p: A
//     o/p: A->a

import java.util.*;

public class FlowControlStatements_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter :  ");
        char a = sc.next().charAt(0);
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index;
        for (index = 0; index < letters.length(); index++) {
            if (a == letters.charAt(index)) {
                break;
            }
        }
        if (index < 26) {
            System.out.println(a + "-->" + letters.charAt(index + 26));
        } else if (index == letters.length()) {
            System.out.println(a + " is an invalid letter.");
        } else {
            System.out.println(a + "-->" + letters.charAt(index - 26));
        }
    }
}
