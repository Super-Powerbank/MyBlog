package com.tulun.JavaMaven.factory;

import com.tulun.JavaMaven.bean.Person;

public class StaticFactory {
    public static Person getPerson(){
        return new Person();
    }

    public static void main(String[] args) {
        Person person =StaticFactory.getPerson();
    }
}
