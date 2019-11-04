package com.dr.designPattern.factory.FactoryMethod.Model;

public class DivOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber/secondNumber;
    }
}
