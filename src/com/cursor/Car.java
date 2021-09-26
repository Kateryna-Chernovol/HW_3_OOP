package com.cursor;

public class Car {

    private boolean runEngine = false;
    private int speed;
    private boolean cruiseControl = false;

    public void startEngine() {
        runEngine = true;
        System.out.print("Car Engine RUNNING. ");
        System.out.println("Speed: " + this.speed);
    }

    public void setSpeed(int speed) {
        int purposeSpeed = speed;
        if (runEngine && speed >= 0 && speed < 250) {


            if (speed > this.speed && speed - this.speed > 15) {
                int iter = (speed - this.speed) / 15;
                for (int i = 0; i < iter - 1; i++) {
                    speed = this.speed + 15;
                    this.speed = speed;
                    System.out.println("Speed: " + this.speed);
                }
            }

            if (speed < this.speed && this.speed - speed > 15) {
                int iter = (this.speed - speed) / 15;
                for (int i = 0; i < iter - 1; i++) {
                    speed = this.speed - 15;
                    this.speed = speed;
                    System.out.println("Speed: " + this.speed);
                }
            }

            this.speed = purposeSpeed;
            System.out.println("Speed: " + this.speed);
        }
        if (speed < 0) {
            this.speed = 0;
        }
        if (cruiseControl) {
            System.out.println("Cruise Control set OFF");
            cruiseControl = false;
        }
    }

    public void setCruiseControl(boolean cruiseControl) {
        if (runEngine && speed > 59 && speed < 115) {
            this.cruiseControl = cruiseControl;
            System.out.println("Cruise Control ON. Speed: " + speed);
        } else {
            System.out.println("Speed must be > 59km/h & < 115km/h. "
                    + "\n" +
                    "Cruise Control cannot be set . ");
        }
    }

    public void stopEngine() {
        cruiseControl = false;
        setSpeed(0);
        runEngine = false;
        System.out.println("STOP Engine");
    }
}