package com.dr.learing.javaBasic;

public class StackTraceAnalysis {
    public static void main(String[] args){
        Throwable ex = new Throwable();

        StackTraceElement[] stackElements = ex.getStackTrace();

        if(stackElements != null)
        {
            for(int i = 0; i < stackElements.length; i++)
            {
                System.out.println(stackElements[i].getClassName());
                System.out.println(stackElements[i].getFileName());
                System.out.println(stackElements[i].getLineNumber());
                System.out.println(stackElements[i].getMethodName());
                System.out.println("-----------------------------------");
            }
        }
    }

}
