package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.Operation;

public class Computer {
    public static void main(String[] args) {
        IFractory fractory = new AddOperationFactory();
        Operation operation = fractory.generateOper();
        float firstNum = 1;
        float secondNum = 2;
        System.out.println(operation.getResult(firstNum,secondNum));
        //(count(firstNum,secondNum,countQuato));
        int i = 1;
    }
}
