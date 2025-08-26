import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Average of three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("average is : " + avg);
        
        // Area of square
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area is : " + area);
        // Bill with GST
        float pen = sc.nextFloat();
        float pensil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pensil + pen + eraser) * 1.18f;
        System.out.println("Total bill including 18% GST:" + total);
        // Checking valid variable name
        int $ = 24;
        System.out.print($);
        sc.close();
    }
}