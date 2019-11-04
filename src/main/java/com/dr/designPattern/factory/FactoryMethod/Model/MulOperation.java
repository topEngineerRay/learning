package com.dr.designPattern.factory.FactoryMethod.Model;

public class MulOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber*secondNumber;
    }
}