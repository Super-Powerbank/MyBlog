package com.tulun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理辅助类：实现一个InvocationHandler接口
 */
public class UserProxy implements InvocationHandler {
    //在辅助类中保存委托类的引用
    private IUser user;

    public UserProxy(IUser user) {
        super();
        this.user = user;
    }

    /**
     * 实现InvocationHandler接口的类，需要实现invoke方法，方法三个参数是：
     *
     * @param proxy ：动态代理生成的代理类对象
     * @param method：就是调用的方法
     * @param args ：方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理类可以实现特有的功能
        System.out.println("Proxy start...");
        //通过method的invoke方法来讲委托类指定，以及该方法的参数传递
        method.invoke(user,args);
        //代理类可以实现特有的功能
        System.out.println("Proxy end...");
        return null;
    }
}
