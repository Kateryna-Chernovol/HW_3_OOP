package com.cursor;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Invalid data. Radius must be > 0.");
        } else {
            double area = circleArea(radius);
            System.out.println("Area of circle with radius " + radius + " : " + area);
        }
    }

    public double circleArea(double radius) {
        this.radius = radius;
        return radius * radius * Math.PI;
    }
}
