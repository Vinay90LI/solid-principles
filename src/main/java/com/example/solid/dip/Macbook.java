package com.example.solid.dip;

public class Macbook {
    private final Keyboard keyboard;
    /*
     private final WiredKeyboard wiredKeyboard;
      public Macbook(WiredKeyboard wiredKeyboard) {
        this.wiredKeyboard = wiredKeyboard;
    }
    then macbook is tightly coupled with WiredKeyboard class so you cant use any other keyboard
    with macbook like wireless keyboard/bluetooth keyboard
    so this macbook(high level module) should not depend on wiredKeyboard (low level module)
    it should depend on abstraction(Keyboard interface) for any other keyboards which is called
    Dependency Inversion Principle(DIP)  then it will be loosely coupled
     */


    public Macbook(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Keyboard getKeyboard() {
      return keyboard;
    }
}
