package com.example.solid.srp;

public class InvoiceDao {
    /***Responsibility: Managing database logic  only***/
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDB(Invoice invoice){
        //code to save invoice to database
        System.out.println("Invoice saved to database");
    }
}
