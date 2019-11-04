package com.dr.designPattern.factory.nvwa.factory;

import com.dr.designPattern.factory.nvwa.Human;

//人类创建工厂
public class HumanFactory extends AbstractHumanFactory {
    //1.下面的代码用到了反射机制
    //2.这里的Human是一个接口，因此在使用的时候可以使用到多态
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // TODO Auto-generated method stub
        Human human = null;
        try{
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("人类生产错误");
            e.printStackTrace();
        }
        return (T)human;
    }

}