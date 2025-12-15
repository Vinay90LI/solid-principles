package com.example.solid.ocp;

import com.example.solid.srp.Invoice;

public class FileInvoiceDao implements InvoiceDao {
    /***Responsibility: saving invoice to file logic only***/
    Invoice invoice;
    public FileInvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    @Override
    public void save() {
        //code to save invoice to file
        System.out.println("Invoice saved to file");
    }
}
