package circle;

import java.util.Scanner;

class Circle {
    // Instance variable for the radius
    private final double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        double pi = 22.0 / 7.0; // Value of π
        return pi * radius * radius; // A = πr^2
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        double pi = 22.0 / 7.0; // Value of π
        return 2 * pi * radius; // C = 2πr
    }
}

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble();
        
        // Create an instance of Circle class
        Circle circle = new Circle(r);
        
        // Calculate area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
        
        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        
        // Close the scanner
        scanner.close();
    }
}