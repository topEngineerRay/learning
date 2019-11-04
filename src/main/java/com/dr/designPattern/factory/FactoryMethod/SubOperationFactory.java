package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.Operation;
import com.dr.designPattern.factory.FactoryMethod.Model.SubOperation;

public class SubOperationFactory implements IFractory {
    @Override
    public Operation generateOper() {
        return new SubOperation();
    }
}