/*
* The program gets a sand input
* and it calculates the image of an hourglass.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-11-08
*
* This is a hour glass program
*/

import java.util.Scanner;
/**
 * This is the main hour glass.
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
     * This is the hour glass function.
     *
     * @param sand this is the sand.
     * @param mid this is the middle.
     */
    static void hourglass(final int sand, final int mid) {

        String hrGlass = "";
        int counter1;
        int counter2;

        for (counter1 = 0; counter1 < mid; counter1++) {
            hrGlass += " ";
        }

        for (counter2 = 0; counter2 < sand; counter2++) {
            hrGlass += "* ";
        }
        System.out.println(hrGlass);

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

        final Scanner firstInput = new Scanner(System.in);
        try {
            System.out.println("This is an hour glass program!");
            System.out.print("Enter your size: ");
            final int amount = firstInput.nextInt();

            if (amount <= 0) {
                System.out.println("Invalid Input, Number to small!");
            } else {
                hourglass(amount, 0);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input");
        }
        System.out.println("\nDone!");
    }
}
