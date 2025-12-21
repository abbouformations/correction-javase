package ma.formation.scanner;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = null;

        System.out.println("Enter a : ");
        scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println("Enter b : ");
        scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        double result = a + b;
        System.out.println(a + " + " + b + "= " + result);
    }
}
