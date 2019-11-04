/*
 * This Class demonstrates use of annotations using reflection.
 * 
 * @author Yashwant Golecha (ygolecha@gmail.com)
 * @version 1.0
 * 
 */

package com.dr.writeAnnotation;

import java.lang.reflect.Method;

public class TestAnnotationReport {
    public TestAnnotationReport() {
        super();
    }

    public static void main(String[] args) {
        businessLogic();
    }

    /**
     * This method iterates through all messages of BusinessLogic class and fetches annotations defined on each of them.
     * After that it displays the information from annotation accordingly.
     */
    private static void businessLogic() {
        
        Class businessLogicClass = BusinessLogic.class;
        for(Method method : businessLogicClass.getMethods()) {
            TestAnnotation testAnnotation = (TestAnnotation)method.getAnnotation(TestAnnotation.class);
            if(testAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + testAnnotation.user());
                System.out.println(" Priority : " + testAnnotation.priority());
                System.out.println(" Status : " + testAnnotation.status());
                System.out.println(" --------------------------- ");
            }
        }
    }
}
