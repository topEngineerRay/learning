package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.MulOperation;
import com.dr.designPattern.factory.FactoryMethod.Model.Operation;

public class MulOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new MulOperation();
    }
}