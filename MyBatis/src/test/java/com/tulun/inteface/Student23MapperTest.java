package com.tulun.inteface;

import com.tulun.pojo.Student23;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class Student23MapperTest {
    SqlSessionFactory sessionFactory = null;
    /**
     * 在编写测试方法之前，经常会在执行测试之前需要创建一些全局对象，单例对象啊
     * 在运行用例即@Test注解之前运行
     * @throws IOException
     */
    @Before
    public void before() throws IOException {
        //获取全局配置文件
        String path = "mybatis-config.xml";
        //通过mybatis提供共的Resources类来获取配置文件流
        InputStream inputStream = Resources.getResourceAsStream(path);

        //获取SQLSessionFactory对象
        sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void selectStudent()throws IOException {
        //获取会话工厂
        SqlSession sqlSession = sessionFactory.openSession();

        //通过反射机制来后去到mapper的实例，getMapper的参数是接口名
        Student23Mapper student23Mapper = sqlSession.getMapper(Student23Mapper.class);

        //SID和Sage都传递
        Student23 student23 = new Student23();
        student23.setSID(1);
        student23.setSage("21");
        student23Mapper.selectStudent(student23);

        //SID传递
        Student23 student231 = new Student23();
        student231.setSID(1831050097);
        student23Mapper.selectStudent(student231);

        //Sage传递
        Student23 student232 = new Student23();
        student232.setSage("21");
        student23Mapper.selectStudent(student232);

        //不传递参数
        Student23 student233 = new Student23();
        student23Mapper.selectStudent(student233);

        sqlSession.close();

    }

//    @Test
//    public void selectStudentByUid() throws IOException {
//        //获取会话工厂
//        SqlSession sqlSession = sessionFactory.openSession();
//
//        //通过反射机制来后去到mapper的实例，getMapper的参数是接口名
//        Student23Mapper student23Mapper = sqlSession.getMapper(Student23Mapper.class);
//        Student23 student23 = student23Mapper.selectStudentByUid(1831050098L);
//        System.out.println(student23);
//
//        sqlSession.close();
//
//    }


    @Test
    public void selectStudentByName() throws IOException {
//        //获取会话工厂
//        SqlSession sqlSession = sessionFactory.openSession();
//
//        //通过反射机制来后去到mapper的实例，getMapper的参数是接口名
//        Student23Mapper student23Mapper = sqlSession.getMapper(Student23Mapper.class);
//        List<Student23> student23s = student23Mapper.selectStudentByName("寇%");
//        System.out.println(student23s.size());
//
//        sqlSession.close();
    }

    @Test
    public  void insertStudent(){
//        SqlSession sqlSession = sessionFactory.openSession();
//        Student23Mapper mapper = sqlSession.getMapper(Student23Mapper.class);
//        Student23 student23 = new Student23();
//        student23.setSID(1831050098);
//        student23.setSname("冯源");
//        student23.setSsex("男");
//        student23.setSage("21");
//        mapper.insertStudent(student23);
//        sqlSession.commit();
//        sqlSession.close();
    }

    @Test
    public void updateStudent(){
//        SqlSession sqlSession = sessionFactory.openSession();
//        Student23Mapper mapper = sqlSession.getMapper(Student23Mapper.class);
//        Student23 student23 = new Student23();
//        student23.setSID(1831050097);
//        student23.setSname("贺SB");
//        student23.setSsex("男");
//        student23.setSage("22");
//        mapper.updateStudent(student23);
//        sqlSession.commit();
//        sqlSession.close();
    }
    @Test
    public void updateStudent1(){
//        SqlSession sqlSession = sessionFactory.openSession();
//        Student23Mapper mapper = sqlSession.getMapper(Student23Mapper.class);
//        Student23 student23 = new Student23();
//        mapper.updateStudent1(1831050097L,"贺武刚大SB");
//        sqlSession.commit();
//        sqlSession.close();
    }

    /**
     * 在Test注解运行的方法之后运行
     */
    @After
    public void after() {

    }
}