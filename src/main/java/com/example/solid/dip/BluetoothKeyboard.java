package com.example.solid.dip;

public class BluetoothKeyboard implements Keyboard{
    @Override
    public void getSpecifications() {
        System.out.println("Bluetooth Keyboard: Wireless connectivity, ergonomic design, rechargeable battery.");
    }
}
