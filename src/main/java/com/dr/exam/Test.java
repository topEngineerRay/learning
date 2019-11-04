package com.dr.exam;

public class Test {
    public static void main(String[] args){
        //testStack1();

        Test test = new Test();

        //test.testStack2();

        test.testStack3();

        //test.testList1();
        test.testList2();
    }

    private void testList1(){

        SimpleList simpleList = new SimpleList(1);
        System.out.println(simpleList.getHead().value);

        simpleList.insert(2);

        simpleList.insert(3);

        simpleList.insert(4);

        System.out.println(simpleList.getSize());

    }

    private void testList2(){

        SimpleList simpleList = new SimpleList(1);
        System.out.println(simpleList.getTail().value);

        simpleList.insert(2);

        simpleList.insertAt(1,3);

        //simpleList.insert(4);
        System.out.println(simpleList.getHead().next.value);

        System.out.println(simpleList.getTail().value);

        simpleList.insert(4);

        System.out.println(simpleList.getTail().value);
    }

    private static void testStack1(){
        TinyStack tinyStack = new TinyStack(10);
        tinyStack.push(1);
        tinyStack.push(2);
        tinyStack.push(3);
        tinyStack.push(4);
        tinyStack.pop();
        tinyStack.pop();
        tinyStack.pop();
        tinyStack.pop();
        //tinyStack.pop();
    }
    private  void testStack2(){
        TinyStack tinyStack = new TinyStack(10);
        tinyStack.push(1);
        tinyStack.push(2);
        tinyStack.pop();
        tinyStack.pop();
        tinyStack.pop();
    }
    private void testStack3(){
        TinyStack tinyStack = new TinyStack(1);
        tinyStack.push(1);
        tinyStack.push(2);
    }
}
