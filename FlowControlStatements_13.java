package Java_with_Wipro;

// Write a program to print prime numbers between 10 and 99.

public class FlowControlStatements_13 {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            int temp = i - 1;
            int divisor_count = 0;
            while (temp > 1) {
                if (i % temp == 0) {
                    divisor_count += 1;
                }
                temp -= 1;
            }
            if (divisor_count == 0) {
                System.out.println(i);
            }
        }
    }
}