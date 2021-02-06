package com;

import com.tulun.inteface.Student23Mapper;
import com.tulun.pojo.Student23;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        //获取全局配置文件
        String path = "mybatis-config.xml";
        //通过mybatis提供共的Resources类来获取配置文件流
        InputStream inputStream = Resources.getResourceAsStream(path);

        //获取SQLSessionFactory对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取会话工厂
        SqlSession sqlSession = sessionFactory.openSession();

        //通过反射机制来后去到mapper的实例
        Student23Mapper student23Mapper = sqlSession.getMapper(Student23Mapper.class);
        Student23 student23 = student23Mapper.selectStudentByUid(1L);

        System.out.println(student23);

        sqlSession.close();
    }
}
