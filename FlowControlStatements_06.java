package Java_with_Wipro;

// Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions .
//     If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
//     If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
//     If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
//     If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

import java.util.*;

public class FlowControlStatements_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (male/female) :  ");
        String gender = sc.next();
        System.out.print("Enter your age :  ");
        int age = sc.nextInt();
        if (gender.equals("female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Percentage of Interest = 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of Interest = 9.2%");
            }
        } else if (gender.equals("male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Percentage of Interest = 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of Interest = 10.5%");
            }
        }
    }
}
