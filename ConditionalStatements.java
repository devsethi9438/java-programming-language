import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // If-Else Statement
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Even-Odd Check
        System.out.print("Enter another number: ");
        int Number = scanner.nextInt();
        if (Number % 2 == 0) {
            System.out.println(Number + " is an even number.");
        } else {
            System.out.println(Number + " is an odd number.");
        }
        
        //Ternary Operator
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        
        // Switch Statement (question 2)
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1:
            dayName = "Monday";
            break;
            case 2:
            dayName = "Tuesday";
            break;
            case 3:
            dayName = "Wednesday";
            break;
            case 4:
            dayName = "Thursday";
            break;
            case 5:
            dayName = "Friday";
            break;
            case 6:
            dayName = "Saturday";
            break;
            case 7:
            dayName = "Sunday";
            break;
            default:
            dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);

        //Calculator using Switch
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            case '%':
                System.out.println("Result: " + (a % b));
            default:
                System.out.println("Invalid operator");
        }

        //Question 1
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }

        //Question 3
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = year % 400 == 0;
        if (( x && y) || (z)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
