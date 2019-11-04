package com.dr.designPattern.Singleton.recommand;

class Singleton {

}
//枚举类（线程安全，调用效率高，不能延时加载，可以天然的防止反射和反序列化调用
//只要 EnumSingleton.INSTANCE.getInstance() 即可获得所要实例
enum EnumSingleton {
    //有问题
    INSTANCE;

    private Singleton instance;

    EnumSingleton() {
        instance = new Singleton();
    }
    public Singleton getInstance() {
        return instance;
    }
}