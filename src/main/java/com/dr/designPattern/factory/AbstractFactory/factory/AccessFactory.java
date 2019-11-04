package com.dr.designPattern.factory.AbstractFactory.factory;

import com.dr.designPattern.factory.AbstractFactory.AccessDepartment;
import com.dr.designPattern.factory.AbstractFactory.AccessUser;
import com.dr.designPattern.factory.AbstractFactory.IDepartment;
import com.dr.designPattern.factory.AbstractFactory.IUser;
import com.dr.designPattern.factory.AbstractFactory.factory.IFacfory;

public class AccessFactory implements IFacfory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}