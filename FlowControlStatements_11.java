package Java_with_Wipro;

// Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.

public class FlowControlStatements_11 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 23 & 57 :");
        for (int i = 23; i < 57; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
