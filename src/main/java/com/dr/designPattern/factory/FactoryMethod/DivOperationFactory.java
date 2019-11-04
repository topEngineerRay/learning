package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.DivOperation;
import com.dr.designPattern.factory.FactoryMethod.Model.Operation;

public class DivOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new DivOperation();
    }
}