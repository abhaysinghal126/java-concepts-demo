import java.util.*;

/**
 * This is a simplified Java fundamentals demo.
 * It demonstrates:
 * - Classes and objects
 * - Static methods
 * - Method overloading
 * - Basic arithmetic and string operations
 * - Printing various data types
 *
 * The static method 'print' can print different types of values:
 * strings, numbers, booleans, and other objects.
 *
 * The static method 'add' is overloaded to perform addition for:
 * - int
 * - double
 * - float
 * - long
 * - String (concatenation)
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
     * @return Concatenation of a and b
     */
    static String add(String a, String b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    /**
     * Entry point of the program.
     * Demonstrates using the static 'print' and 'add' methods with different types of values.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Printing different types using the static 'print' method
        print("Hello, World!");  // Printing a string
        print(42);               // Printing an integer
        print(3.14);             // Printing a double
        print(true);             // Printing a boolean

        // Demonstrates that you can also print objects
        Date now = new Date();
        print(now);              // Printing a Date object

        // Using overloaded 'add' methods
        print(add(1, 2));                     // Adds two integers
        print(add("Hello, ", "World!"));      // Concatenates two strings
        print(add(3.0, 0.14));                // Adds two doubles
        print(add(123456789L, 123456789L));  // Adds two long values

        // Demonstrates flexibility: 'print' can handle return values from any 'add' method
    }
}
