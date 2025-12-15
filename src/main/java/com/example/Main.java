package com.example;

import com.example.solid.ocp.DatabaseInvoiceDao;
import com.example.solid.ocp.FileInvoiceDao;
import com.example.solid.srp.Invoice;
import com.example.solid.srp.InvoiceDao;
import com.example.solid.srp.InvoicePrinter;
import com.example.solid.srp.Marker;

public class Main {
    public static void main(String[] args){
        /***Single Responsibility Principle Implementation***/
        Invoice invoice=new Invoice(new Marker("marker1","coral",20),5);
        InvoiceDao invoiceDao=new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter=new InvoicePrinter(invoice);
        System.out.println(invoice.calculateTotal());
        invoiceDao.saveToDB(invoice);
        invoicePrinter.printing();
        //**Open/Closed Principle Implementation***/
        DatabaseInvoiceDao databaseInvoiceDao=new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save();
        FileInvoiceDao fileInvoiceDao=new FileInvoiceDao(invoice);
        fileInvoiceDao.save();
    }
}