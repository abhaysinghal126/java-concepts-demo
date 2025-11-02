import java.util.*;

/**
 * =============================================================
 *  Java Fundamentals Demonstration
 *  -------------------------------------------------------------
 *  This program showcases essential Java concepts, including:
 *  - Classes and objects
 *  - Static methods
 *  - Method overloading
 *  - Basic arithmetic and string operations
 *  - Input and output handling
 *  - Conditional logic (if-else, ternary operator)
 *
 *  Features:
 *  - The {@code print()} method can display any type of object.
 *  - The {@code add()} method is overloaded for multiple data types.
 *  - The {@code isOdd()} method determines if a number is odd or even.
 *  - The {@code input()} method reads user input from the console.
 *
 *  This file demonstrates clean, readable Java fundamentals with
 *  reusable static utility methods.
 *
 *  @author  Abhay Singhal
 *  @version 1.1
 *  @since   2025-11-02
 * =============================================================
 */
public class Main {

    /** Shared Scanner instance for input across all methods. */
    static Scanner scanner = new Scanner(System.in);

    // =============================================================
    // Utility Methods
    // =============================================================

    /**
     * Prints any object to the console.
     * <p>
     * Demonstrates method overloading and dynamic typing
     * through the use of {@code Object} parameters.
     *
     * @param obj The object to print (can be of any type)
     */
    static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * Prompts the user for input and returns the response as an Object.
     * <p>
     * The returned value is a String by default and may be type-cast
     * by the caller if needed.
     *
     * @param prompt The message displayed to the user
     * @return The user's input as an Object (typically a String)
     */
    static Object input(Object prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // =============================================================
    // Conditional Logic
    // =============================================================

    /**
     * Determines whether an integer is odd or even.
     *
     * @param num The integer to evaluate
     * @return A message stating whether the number is odd or even
     */
    static String isOdd(int num) {
        return (num % 2 != 0) ? "It's odd!" : "It's even!";
    }

    /**
     * Determines whether a long value is odd or even.
     * <p>
     * Demonstrates method overloading with different numeric types.
     *
     * @param num The long integer to evaluate
     * @return A message stating whether the number is odd or even
     */
    static String isOdd(long num) {
        return (num % 2 != 0) ? "It's odd!" : "It's even!";
    }

    // =============================================================
    // Arithmetic Operations (Method Overloading)
    // =============================================================

    /**
     * Adds two integers and returns the sum.
     *
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double values and returns the sum.
     *
     * @param a First double
     * @param b Second double
     * @return Sum of a and b
     */
    static double add(double a, double b) {
        return a + b;
    }

    /**
     * Adds two float values and returns the sum.
     *
     * @param a First float
     * @param b Second float
     * @return Sum of a and b
     */
    static float add(float a, float b) {
        return a + b;
    }

    /**
     * Adds two long values and returns the sum.
     *
     * @param a First long
     * @param b Second long
     * @return Sum of a and b
     */
    static long add(long a, long b) {
        return a + b;
    }

    /**
     * Concatenates two strings and returns the result.
     *
     * @param a First string
     * @param b Second string
     * @return Concatenated string
     */
    static String add(String a, String b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    // =============================================================
    // Main Method
    // =============================================================

    /**
     * The program's entry point.
     * <p>
     * Demonstrates the use of static methods for input, output,
     * condition checks, and arithmetic operations.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {

        // Example: prompt user for a number and check odd/even
        int num = Integer.parseInt((String) input("Enter a number:"));
        print(isOdd(num));

        // Example: method overloading with hard-coded inputs
        print(isOdd(2));                      // Even check
        print(add(1, 2));                     // Integer addition
        print(add("Hello, ", "World!"));      // String concatenation
        print(add(3.0, 0.14));                // Double addition
        print(add(123456789L, 987654321L));   // Long addition

        // Example: print any object type
        print(new Date());                    // Prints current date

        // Note: Scanner intentionally not closed to allow reuse
        // across methods for simplicity in demonstration
    }
}
