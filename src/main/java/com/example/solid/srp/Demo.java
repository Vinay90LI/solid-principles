package com.example.solid.srp;

/***
 * Key benifits of SRP:
 * Each class has now only one reason to change.
 * Invoice: only changes if invoice calculation logic rule changes
 * InvoiceDao: only changes if database logic changes
 * InvoicePrinter: only changes if printing logic or requirement changes
 * Better maintainability :changes to one functionality don't affect others.
 * Improved Testability: Each class can be tested independently or in isolation(means independently).
 * Enhanced Reusability:Classes can be reused in different contexts.For Example,different types of invoices
 * can use the same InvoiceDao for database operations or same Invoice printer for printing.
 */
public class Demo {
    public static void main(String[] args){
        Invoice invoice=new Invoice(new Marker("marker1","coral",20),5);
        InvoiceDao invoiceDao=new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter=new InvoicePrinter(invoice);
        System.out.println(invoice.calculateTotal());
        invoiceDao.saveToDB(invoice);
        invoicePrinter.printing();
    }
}
