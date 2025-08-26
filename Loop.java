import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Print Counter
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
        //Sum of first n natural numbers
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}