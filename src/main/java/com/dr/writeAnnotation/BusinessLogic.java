/*
 * This Class demonstrates use of Todo annotation defined in Todo.java
 * 
 * @author Yashwant Golecha (ygolecha@gmail.com)
 * @version 1.0
 * 
 */

package com.dr.writeAnnotation;

public class BusinessLogic {

    @TestAnnotation(priority = TestAnnotation.Priority.HIGH)
    public void methodA() {
        //Some business logic is written
    }
    
    @TestAnnotation(priority = TestAnnotation.Priority.MEDIUM, user = "xyz", status = TestAnnotation.Status.STARTED)
    public void methodB() {
        //Some business logic is written
    }

    @TestAnnotation(priority = TestAnnotation.Priority.LOW, status = TestAnnotation.Status.STARTED )
    public void methodC() {
        //Some business logic is written
    }
}
