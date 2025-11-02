import java.util.*;
public class isOdd {
    public static String isOdd(int obj) {
        if (obj % 2 != 0) {
            return "Its odd!";
        } else {
            return "Its even";
        }
    }

    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number, 0 if you want to quit!");
            try {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");
                }

            } catch(InputMismatchException e) {
                System.out.println("That’s not an integer. Try again!");
                scanner.next(); // clear invalid input
            }
        }
    }
}

