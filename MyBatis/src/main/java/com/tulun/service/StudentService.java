package com.tulun.service;

import com.tulun.inteface.Student23Mapper;
import com.tulun.pojo.Student23;

import java.util.List;

public class StudentService {

    /**
     * service层调用Dao层(mapper)
     */
    private Student23Mapper student23Mapper;

    /**
     * 通过依赖注入的构造函数方式来student23Mapper的依赖注入
     * @param student23Mapper
     */
    public  StudentService(Student23Mapper student23Mapper){
        this.student23Mapper = student23Mapper;
    }

    public List<Student23> getAllStudent(){
        return  student23Mapper.selectAllStudent();
    }

}
