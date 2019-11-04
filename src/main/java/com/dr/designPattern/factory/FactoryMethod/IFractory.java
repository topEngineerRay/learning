package com.dr.designPattern.factory.FactoryMethod;

import com.dr.designPattern.factory.FactoryMethod.Model.Operation;

//定义上级工厂的接口
public interface IFractory {
    public Operation generateOper();
}