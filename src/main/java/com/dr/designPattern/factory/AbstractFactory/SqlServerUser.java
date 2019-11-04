package com.dr.designPattern.factory.AbstractFactory;

public class SqlServerUser implements IUser {
    @Override
    public void insert() {
        System.out.println("insert into sqlserver.");
    }

    @Override
    public void getById() {
        System.out.println("get user by id from sqlserver.");
    }
}