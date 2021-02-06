package com.tulun.JavaMaven.factory;

import com.tulun.JavaMaven.bean.Person;

public class CommonFactory {
    public Person getPerson(){
        return new Person();
    }

    public static void main(String[] args) {
        CommonFactory commonFactory = new CommonFactory();
        Person person = commonFactory.getPerson();
    }
}
