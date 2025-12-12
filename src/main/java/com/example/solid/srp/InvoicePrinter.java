package com.example.solid.srp;

public class InvoicePrinter {
    /***Responsibility: printing invoice logic only***/
    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }
    public void printing(){
        //all the logic here to printing the invoice
        System.out.println("printing Invoice");
    }
}
