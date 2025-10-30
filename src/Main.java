import java.util.*;

/**
 * This is a simplified Java fundamentals demo.
 * It demonstrates classes, objects, and a static method.
 * The static method 'print' can print different types of values: strings, numbers, booleans, etc.
 *
 * @author Abhay Singhal
 */

public class Main {

    /**
     * Prints any object using a static method.
     * This method is flexible and can print values of different types:
     * - Strings
     * - Integers
     * - Doubles
     * - Booleans
     * - Any other Object
     *
     * @param obj The object to print
     */
    static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * Entry point of the program.
     * Demonstrates using the static 'print' method with different types of values.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Using the static method to print different types of values
        print("Hello, World!");  // printing a string
        print(42);               // printing an integer
        print(3.14);             // printing a double
        print(true);             // printing a boolean

        // Demonstrates that you can also print objects
        Date now = new Date();
        print(now);              // printing an object
    }
}
