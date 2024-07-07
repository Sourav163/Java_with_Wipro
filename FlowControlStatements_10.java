package Java_with_Wipro;

// Write a program to print numbers from 1 to 10 in a single row with one tab space.

public class FlowControlStatements_10 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + "\t");
            } else {
                System.out.println(i);
            }
        }
    }
}
