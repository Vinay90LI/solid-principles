package com.example.solid.ocp;

import com.example.solid.srp.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {
    Invoice invoice;
    public DatabaseInvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    @Override
    public void save() {
        //code to save invoice to database
        System.out.println("Invoice saved to database");
    }
}