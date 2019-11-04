package com.dr.designPattern.factory.AbstractFactory;
public class AccessUser implements IUser {
    @Override
    public void insert() {
        System.out.println("insert into access");
    }

    @Override
    public void getById() {
        System.out.println("get by id from access");
    }
}