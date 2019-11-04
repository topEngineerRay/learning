package com.dr.designPattern.factory.FactoryMethod.Model;

//把符号都当做对象处理，实现此接口
public class AddOperation extends Operation {
    @Override
    public float getResult(float firstNumber, float secondNumber) {
        return firstNumber+secondNumber;
    }

}