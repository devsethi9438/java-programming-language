import java.util.Scanner;

public class Function {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    //Factorial of a number
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //Bimonial Coefficient
    public static int BimonialCoefficient(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_n_r = Factorial(n - r);
        int bionomial = fact_n / (fact_r * fact_n_r);
        return bionomial;
    }

    //Prime Number
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n <= 1) {
            return false;
        } if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sum of two numbers
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("Product of " + a + " & "+ b + " is: " + (prod));

        //Factorial of a number
        int factorial = Factorial(a);
        System.out.println("Factorial of " + a + " is: " + factorial);
        int fact = Factorial(b);
        System.out.println("Factorial of " + b + " is: " + fact);

        //Bimonial Coefficient
        int bc = BimonialCoefficient(a, b);
        System.out.println("Bimonial Coefficient of " + a + " & "+ b + " is: " + bc);

        //Prime Number
        boolean prime = isPrime(a);
        System.out.println("Is "+ a +" a prime number: " + prime);
        boolean pr = isPrime(b);
        System.out.println("Is " + b + " a prime number: " + pr);
        sc.close();
    }
}