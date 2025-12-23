import java.util.Scanner;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) return Double.NaN;
        return (double) a / b;
    }
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("-----ADDITION-----\n");
        System.out.print("Enter two integers: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.println("Sum (int + int): " + calc.add(int1, int2));
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum (int + int + int): " + calc.add(a, b, c));
        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum (double + double): " + calc.add(d1, d2));
        System.out.print("Enter an integer and a decimal number: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println("Sum (int + double): " + calc.add(i, d));
        System.out.print("Enter a decimal number and an integer: ");
        double d3 = sc.nextDouble();
        int i2 = sc.nextInt();
        System.out.println("Sum (double + int): " + calc.add(d3, i2));
        System.out.print("\n-----SUBTRACTION-----\n");
        System.out.print("Enter two integers for subtraction: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println("Subtraction (int - int): " + calc.subtract(s1, s2));
        System.out.print("\n-----MULTIPLICATION-----\n");
        System.out.print("Enter two integers for multiplication: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        System.out.println("Multiplication (int * int): " + calc.multiply(m1, m2));
        System.out.print("\n-----DIVISION-----\n");
        System.out.print("Enter two integers for division: ");
        int div1 = sc.nextInt();
        int div2 = sc.nextInt();
        System.out.println("Division (int / int): " + calc.divide(div1, div2));
        sc.close();
    }
}
