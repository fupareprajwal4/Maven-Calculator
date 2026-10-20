
package com.example;

import java.util.Scanner;

public class Calculator {

    public static double calculate(double a, char op, double b) {
        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException(
                            "Cannot divide by zero"
                    );
                }
                return a / b;

            default:
                throw new IllegalArgumentException(
                        "Invalid operator"
                );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== My Calculator ===");

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        try {
            double result = calculate(a, op, b);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
