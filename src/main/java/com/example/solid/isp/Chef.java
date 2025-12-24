package com.example.solid.isp;
//it follows interface segregation principle
//now class implements only what they need actually - Clean Implementations
public class Chef implements ChefTasks{
    @Override
    public void prepareFood() {
        System.out.println("Chef is preparing food.");
    }

    @Override
    public void decideMenu() {
        System.out.println("Chef is deciding the menu.");
    }

}
