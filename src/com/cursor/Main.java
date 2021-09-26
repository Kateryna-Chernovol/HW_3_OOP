package com.cursor;

public class Main {

    public static void main(String[] args) {
        //1
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(-5);
        System.out.println();

        //2
        Car myCar = new Car();
        myCar.startEngine();
        myCar.setSpeed(70);
        myCar.setCruiseControl(true);
        myCar.setSpeed(60);
        myCar.stopEngine();
        System.out.println();

        //3
        Money money = new Money();
        money.addition(15L, (byte) 12, 15L, (byte) 10);
        money.subtraction(150L, (byte) 10, 100L, (byte) 15);
        money.division(12L, (byte) 5, 2L, (byte) 5);
        money.divideSumByFractional(20L, (byte) 5, 2.5);
        money.multiplByFractNum(3L, (byte) 1, 6.9);
        money.comparisonOperations(12L, (byte) 91, 100L, (byte) 55);
        money.comparisonOperations(12L, (byte) 91, 10L, (byte) 10);
        money.comparisonOperations(105L, (byte) 10, 105L, (byte) 10);
    }
}
