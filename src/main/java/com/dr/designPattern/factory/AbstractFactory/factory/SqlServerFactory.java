package com.dr.designPattern.factory.AbstractFactory.factory;

import com.dr.designPattern.factory.AbstractFactory.IDepartment;
import com.dr.designPattern.factory.AbstractFactory.IUser;
import com.dr.designPattern.factory.AbstractFactory.SqlServerDepartment;
import com.dr.designPattern.factory.AbstractFactory.SqlServerUser;
import com.dr.designPattern.factory.AbstractFactory.factory.IFacfory;

//不同产品组使用一个工厂
public class SqlServerFactory implements IFacfory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}