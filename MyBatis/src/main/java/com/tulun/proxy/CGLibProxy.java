package com.tulun.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public <T> T getProxy(Class<T> tClass) {
        //设置需要创建子类的类
        enhancer.setSuperclass(tClass);
        enhancer.setCallback(this);
        //通过字节码产生子类实例
        return (T)enhancer.create();
    }

    /**
     *intercept方法拦截所有目标类的方法
     * Object o：表示目标类的实例
     * Method method：目标类方法
     * Object[] objects：动态的参数入参
     * MethodProxy methodProxy：方法代理
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLibProxy start...");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLibProxy end...");
        return o1;
    }
}
