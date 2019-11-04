package com.dr.designPattern.factory.nvwa.factory;

import com.dr.designPattern.factory.nvwa.Human;

//下面的代码用到了泛型
//抽象人类创建工厂，泛型限定了输入参数必须是Class类型、必须是Human的实现类
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}