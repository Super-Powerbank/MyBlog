package com.tulun.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //动态代理的使用
        /**
         * 动态代理产生使用Proxy.newProxyInstance方法生成，有三个要素
         * ClassLoader loader：指定当前的加载器即可
         * Class<?>[] interfaces：被代理的接口
         * InvocationHandler h ：代理辅助类
         */
//        IUser user = (IUser) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{IUser.class}, new UserProxy(new RealUser()));
//        user.talk();



        CGLibProxy cgLibProxy = new CGLibProxy();
        //动态代理产生的子类
        CGlibSuper proxy = cgLibProxy.getProxy(CGlibSuper.class);
        proxy.doing();
    }
}
