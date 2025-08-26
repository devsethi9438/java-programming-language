import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Prime Number
        int count = 1;
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean isPrime = true;
            if (num == 2) {
                isPrime = true;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                    }
                }
            }
            if (isPrime == true) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
            count++;
        } while (count <= 5);

        //even odd sum
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
        System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("if you want to continue press 1 or if not press anything : ");
            choice = scanner.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        //factorial
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);

        //multiplication table
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        System.out.print("Enter the range up to which you want the multiplication table: ");
        int range = scanner.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}