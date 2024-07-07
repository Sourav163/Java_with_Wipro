package Java_with_Wipro;

// Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
// Example-1 :
//     If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.
// Example-2 :
//     If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai
// [Note: It is mandatory to pass two arguments in command line]

public class LanguageBasics_1 {
    public static void main(String[] args) {
//        Example-1 :
        String commandLineArgument_1 = "Wipro";
        String commandLineArgument_2 = "Bangalore";
        System.out.println(commandLineArgument_1 + " Technologies " + commandLineArgument_2);

//        Example-2 :
        commandLineArgument_1 = "ABC";
        commandLineArgument_2 = "Mumbai";
        System.out.println(commandLineArgument_1 + " Technologies " + commandLineArgument_2);
    }
}
