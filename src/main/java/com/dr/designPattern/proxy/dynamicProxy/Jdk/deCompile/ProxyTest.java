package com.dr.designPattern.proxy.dynamicProxy.Jdk.deCompile;

import com.dr.designPattern.proxy.dynamicProxy.Jdk.JDKProxy;
import com.dr.designPattern.proxy.dynamicProxy.UserManager;
import com.dr.designPattern.proxy.dynamicProxy.UserManagerImpl;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy() throws Throwable {
        // 实例化目标对象
        UserManager userManager = new UserManagerImpl();

        // 实例化InvocationHandler
        UserManager userManagerProxy = (UserManager) new JDKProxy().newProxy(userManager);

        // 根据目标对象生成代理对象

        // 调用代理对象的方法
       /* userManagerProxy.addUser("ray","ding");
        $Proxy p = new $Proxy();
        p.addUser("ray","test");*/
    }

    @Test
    public void testGenerateProxyClass() {
        ProxyGeneratorUtils.writeProxyClassToHardDisk("C:\\$Proxy.class");
    }
}