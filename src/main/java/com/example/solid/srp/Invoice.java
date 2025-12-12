package com.example.solid.srp;
/***Responsibility: Managing core business computation logic only***/
public class Invoice {
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker,int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateTotal(){
        return this.marker.price * this.quantity;
    }
}
