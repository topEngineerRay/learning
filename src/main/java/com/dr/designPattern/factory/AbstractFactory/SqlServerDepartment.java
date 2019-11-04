package com.dr.designPattern.factory.AbstractFactory;
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert() {
        System.out.println("insert department into sqlserver.");
    }

    @Override
    public void getDepartmentById() {
        System.out.println("get department in sqlserver by id.");
    }
}