package com.dr.designPattern.factory.AbstractFactory.factory;

import com.dr.designPattern.factory.AbstractFactory.IDepartment;
import com.dr.designPattern.factory.AbstractFactory.IUser;

public interface IFacfory {
    public IUser createUser();
    public IDepartment createDepartment();
}
