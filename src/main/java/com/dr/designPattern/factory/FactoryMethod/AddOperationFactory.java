package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.AddOperation;
import com.dr.designPattern.factory.FactoryMethod.Model.Operation;

/**
 * 工厂方法  为每个对象生成一个工厂类
 */
public class AddOperationFactory implements IFractory{

    @Override
    public Operation generateOper() {
        return new AddOperation();
    }
}