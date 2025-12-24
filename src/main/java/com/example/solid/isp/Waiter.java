package com.example.solid.isp;
///it follows interface segregation principle
//now class implements only what they need actually -Clean Implementations
public class Waiter implements WaiterTasks {
    @Override
    public void serveCustomer() {
        System.out.println("Serving Food and Drinks");// Implementation for serving customers
    }

    @Override
    public void takeOrder() {
        System .out.println("Taking order ....");// Implementation for taking orders
    }
}
