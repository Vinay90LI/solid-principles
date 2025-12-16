package com.example.solid.lsp;

public class MotorCycle extends Bike implements Engine {
    String Company;
    boolean isEngine;
    int speed;
    public MotorCycle(String company,  int speed) {
        this.Company = company;
        this.speed = speed;
    }
    @Override
    public void accelerate() {
        this.speed=this.speed+15;
        System.out.println("MotorCycle Speed" + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed=this.speed-10;
        System.out.println("MotorCycle Speed" + this.speed);
    }

    @Override
    public void turnOnEngine() {
        this.isEngine=true;
        System.out.println("MotorCycle engine turned ON");
    }

    @Override
    public void turnOffEngine() {
        this.isEngine=false;
        System.out.println("MotorCycle engine turned OFF");
    }

}
