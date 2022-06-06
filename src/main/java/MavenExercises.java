import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {
//TODO: Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
// Tells whether or not what the user entered is a number
// Flips the case of the string
// Reverses the string
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();
        System.out.println("You Entered: " + input);
        System.out.println(StringUtils.isNumeric(input));
        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));
    }
}

