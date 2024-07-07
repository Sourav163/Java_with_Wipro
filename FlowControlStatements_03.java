package Java_with_Wipro;

// Write a program to check if the program has received command line arguments or not.
// If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
// Example-1 :
//     java Example
//     O/P: No Values
// Example-2 :
//     java Example Mumbai Bangalore
//     O/P: Mumbai, Bangalore

public class FlowControlStatements_03 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int index = 0; index < args.length; index++) {
                if (index < args.length - 1) {
                    System.out.print(args[index] + ", ");
                } else {
                    System.out.println(args[index]);
                }
            }
        } else {
            System.out.println("No Values");
        }
    }
}
