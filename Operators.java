public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Addition
        System.out.println("Addition: " + (a + b));
        // Subtraction
        System.out.println("Subtraction: " + (b - a));
        // Multiplication
        System.out.println("Multiplication: " + (a * b));
        // Division
        System.out.println("Division: " + (b / a));
        // Modulus
        System.out.println("Modulus: " + (b % a));
        // Increment
        System.out.println("Increment a: " + (++a));
        // Decrement
        System.out.println("Decrement b: " + (--b));
        
        // Compound Assignment
        a += 5; // a = a + 5
        System.out.println("Compound Assignment a += 5: " + a);
        System.out.println("Value of b after decrement: " + b);
        
        // Comparison Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        
        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
    }
}