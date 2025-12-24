package com.example.solid.dip;

public class WiredKeyboard implements Keyboard {
    @Override
    public void getSpecifications() {
        System.out.println("Wired Keyboard: USB connection, no batteries required.");
    }
}
