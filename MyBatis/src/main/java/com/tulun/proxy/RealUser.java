package com.tulun.proxy;

/**
 * 委托类：是接口的真正实现类
 */
public class RealUser implements IUser{
    @Override
    public void talk() {
        System.out.println("RealUser is talking");
    }
}
