package com.dr.designPattern.factory.FactoryMethod.Model;

public class SubOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber-secondNumber;
    }
}