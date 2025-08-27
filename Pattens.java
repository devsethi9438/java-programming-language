import java.util.Scanner;

public class Pattens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter every other odd number: ");
        int rows = sc.nextInt();

        // Char Pattern
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println();

        // Inverted Star Pattern
        for (int i = rows; i >= 1; i--) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Star Pattern
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Sum Pattern
        int sum = 0;
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " -> ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" + ");
                }
            }
            sum += i;
            System.out.println(" = " + sum);
        }
        System.out.println();

        // Factorial Pattern
        int product = 1;
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + "! -> ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" * ");
                }
            }
            product *= i;
            System.out.println(" = " + product);
        }
        System.out.println();

        // Diamond Pattern
        // Upper Half
        for (int i = 1; i <= rows; i += 2) {
            for (int space = 0; space < (rows - i) / 2; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = rows - 2; i >= 1; i -= 2) {
            for (int space = 0; space < (rows - i) / 2; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}