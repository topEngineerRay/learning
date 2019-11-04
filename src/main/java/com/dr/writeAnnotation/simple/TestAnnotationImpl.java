package com.dr.writeAnnotation.simple;

import com.dr.writeAnnotation.BusinessLogic;

import java.lang.reflect.Method;

public class TestAnnotationImpl {
    public static void main(String[] args) {
        annotationLogic();
    }

    /**
     * This method iterates through all messages of BusinessLogic class and fetches annotations defined on each of them.
     * After that it displays the information from annotation accordingly.
     */
    private static void annotationLogic() {

        Class useAnnotationClass = UseAnnotation.class;
        for(Method method : useAnnotationClass.getMethods()) {
            SimpleAnnotation simpleAnnotation = (SimpleAnnotation)method.getAnnotation(SimpleAnnotation.class);
            if(simpleAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" value : " + simpleAnnotation.value());
                System.out.println(" --------------------------- ");
            }
        }
    }
}
