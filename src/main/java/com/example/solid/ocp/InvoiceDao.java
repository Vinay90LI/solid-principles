package com.example.solid.ocp;
/***Open Closed Principle***/
/***The interface is open for extension by creating new classes that implement it
 * but closed for modification as we do not need to change the interface itself***/

/***
 *Benefits of OCP here:
 * --Reduced risk: existing code is not modified, reducing the risk of introducing bugs.Existing tested code remains unchanged
 * --Better Maintainability: new features don't break existing functionality
 * Improved flexibility: new types of invoice saving mechanisms can be added without changing existing code.
 *                                  means  easy to add new behaviours without modifying existing code.
 * --Enhanced testability: new implementations can be tested independently without affecting existing ones.
 * --support for polymorphism: different implementations of InvoiceDao can be used interchangeably.
 * and enables dynamic behaviour through interfaces and inheritance.
 */

public interface InvoiceDao {

    void save();
}


