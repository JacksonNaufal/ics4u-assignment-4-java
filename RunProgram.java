/*
*
* This is a standared run program that finds the most used
* character in a userInputted string.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-10
*
* This is a run program.
*/

import java.util.Scanner;
/**
 * This is a rock, paper, scissors program.
 */

final class RunProgram {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private RunProgram() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param userInput the users userInput
    * @return count Returns the run
    */

    public static int runCalculation(final String userInput) {
        // Variables.
        int total = 0;
        int count = 0;
        char previous = ' ';

        // counts how many occrances of a charactor are in
        // a string that the userInputtedArray.
        for (char userSingleInput: userInput.toCharArray()) {

            // checks previos charactors, if they equal eachother the counter
            // will go up by 1.
            if (userSingleInput == previous) {
                total++;

            // if there are no charactors that share a run, the
            // run will be 1.
            } else {
                total = 1;
                previous = userSingleInput;
            }

            // the count is the total run that is found
            // within the string inputted.
            if (total > count) {
                count = total;
            }
        }

        // returns the total run in count to the main
        // function to output the result.
        return count;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        // This is for visual effects when the user
        // first opens up the program this is
        // what they will see.
        System.out.println("This is a run program!");
        System.out.println("This program will calculate the run of STRINGS!");
        System.out.println("STRING EX, xxyyyz, this STRING has a run of 3!");

        // this gets the users string that they input
        // to get the string
        final Scanner userWord = new Scanner(System.in);
        System.out.print("Enter your run: ");

        // conerts the word inputted to userInput.
        final String userInput = userWord.nextLine();

        // gets the maxRun of the program.
        final int maxRun = runCalculation(userInput);

        // outputs the maxRun of the program.
        System.out.println("The highest run is " + maxRun + "!");

        // End of program
        System.out.println("\nDone!");

    }
}
