/*
* The program gets a sand input
* and it calculates the image of an hourglass.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-11-23
*
* This is a hourglass program
*/
import java.util.Scanner;

/**
 * This is the main hourglass.
 * Class Main
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This is the hourglass function.
     *
     * @param sand this is the sand.
     * @param mid this is the middle.
     */
    static void hourglass(final int sand, final int mid) {

        // These are the variables
        String hrGlass = "";

        // This is the loop for the blankspace
        for (int counter1 = 0; counter1 < mid; counter1++) {
            hrGlass += " ";
        }

        // This is where the * are placed
        for (int counter2 = 0; counter2 < sand; counter2++) {
            hrGlass += "* ";
        }
        System.out.println(hrGlass);

        // recursive formula
        if (sand > 1) {
            hourglass(sand - 1, mid + 1);
        }
        System.out.println(hrGlass);
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Scanner for first input.
        final Scanner firstInput = new Scanner(System.in);

        // What the program is and Input.
        System.out.println("This is an hourglass program!");
        System.out.print("Enter your amount: ");

        try {
            final int amount = firstInput.nextInt();
            System.out.println("");

            // Checks users validity.
            if (amount <= 0) {
                System.out.println("Invalid Input, Number is to small!");
            } else {
                hourglass(amount, 0);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input");
        }
        System.out.println("\nDone!");
    }
}
