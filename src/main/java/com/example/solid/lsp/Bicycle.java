package com.example.solid.lsp;

public class Bicycle extends Bike {
    String Brand;
    boolean hasGears;
    int speed;
    public Bicycle(String brand, boolean hasGears, int speed) {
        this.Brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed=this.speed+10;
        System.out.println("Bicycle  Speed" + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed=this.speed-5;
        System.out.println("Bicycle Speed" + this.speed);
    }
}
