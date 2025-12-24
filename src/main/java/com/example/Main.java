package com.example;

import com.example.solid.dip.BluetoothKeyboard;
import com.example.solid.dip.Macbook;
import com.example.solid.dip.WiredKeyboard;
import com.example.solid.isp.Chef;
import com.example.solid.isp.ChefTasks;
import com.example.solid.isp.Waiter;
import com.example.solid.isp.WaiterTasks;
import com.example.solid.lsp.Bicycle;
import com.example.solid.lsp.MotorCycle;
import com.example.solid.ocp.DatabaseInvoiceDao;
import com.example.solid.ocp.FileInvoiceDao;
import com.example.solid.srp.Invoice;
import com.example.solid.srp.InvoiceDao;
import com.example.solid.srp.InvoicePrinter;
import com.example.solid.srp.Marker;

public class Main {
    public static void main(String[] args){
        //***Single Responsibility Principle Implementation***/
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

        //***Liskov Substitution Principle Implementation***/
        MotorCycle motorcycle=new MotorCycle("Hero",10);
        Bicycle bicycle=new Bicycle("Hercules",true,10);

        //works fine with Bicycle -implements all Bike class behaviour and Engine class as well
        motorcycle.turnOnEngine();
        motorcycle.accelerate();
        motorcycle.applyBrakes();
        motorcycle.turnOffEngine();
        //works fine with Bicycle -implements all Bike class behaviour
        bicycle.accelerate();
        bicycle.applyBrakes();

        //***Interface Segregation Principle Implementation***/
        ChefTasks chef=new Chef();
        chef.prepareFood();
        chef.decideMenu();

        WaiterTasks waiter=new Waiter();
        waiter.serveCustomer();
        waiter.takeOrder();

        /*Benefits:
        --prevents bloated classes by having each class implement only the methods they need.
        --No forced dependencies on irrelevant functionality
        --Cleaner,more maintainable design/code.
         */

        /***Dependency Inversion Principle Implementation***/
        WiredKeyboard wiredKeyboard=new WiredKeyboard();
        Macbook macbook=new Macbook(wiredKeyboard);
        macbook.getKeyboard().getSpecifications();

        BluetoothKeyboard bluetoothKeyboard=new BluetoothKeyboard();
         macbook=new Macbook(bluetoothKeyboard);
        macbook.getKeyboard().getSpecifications();

        /*Benefits:
        --High-level modules are not dependent on low-level modules. Both depend on abstractions.
        Any different Macbook parts can be injected without changing Macbook class.
        Easy to mock dependencies for testing.
        New Macbook parts can be added without modifying existing code.
         */

    }
}