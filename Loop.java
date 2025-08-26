import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Print Counter
        int counter = 0;
        System.out.print("Enter a number in 10's : ");
        int Input = scanner.nextInt();
        while (counter <= Input) {
            System.out.print(counter);
            if (counter < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            System.out.print("<-- counter\n");
            counter += 5;
        }

        // Sum of first n natural numbers
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // For Loop
        System.out.print("Enter a number in 10's : ");
        int In = scanner.nextInt();
        for (int j = 0; j <= In; j += 5) {
            System.out.print(j);
            if (j < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            System.out.print("<-- counter\n");
        }

        // Square pattern
        System.out.println("Square pattern");
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reverse a number
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        System.out.print("The reverse of " + num + " is: ");
        for (int val = num; val > 0; val /= 10) {
            System.out.print(val % 10);
        }
        System.out.print("\n");

        // Exit loop
        do {
            System.out.print("Enter a Magic Number b/w 1 to 10: ");
            int magic = scanner.nextInt();
            if (magic % 2 == 1) {
                break;
            }
            System.out.println("You have entered a Magic Number");
        } while (true);
        System.out.println("Your number is not a Magic Number");

        // Continue Statement
        do {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 5 == 0) {
                continue;
            }
            System.out.println("You have entered something that is not divisible by 5.");
        } while (true);

        scanner.close();
    }
}