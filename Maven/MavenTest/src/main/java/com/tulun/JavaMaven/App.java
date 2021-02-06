package com.tulun.JavaMaven;

import com.tulun.JavaMaven.bean.Person;
import com.tulun.JavaMaven.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//public class  App
//{
//    public static void main( String[] args )
//    {
////        System.out.println( "Hello World!" );
//        //获取IOC容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        //在容器中获取需要的对象
//        Person person = (Person) context.getBean("person2");
//        System.out.println(person);
//    }
//}
public class App{
    public static void main( String[] args ){
        //获取IOC的容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //通过容器来获取当前的对象
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
