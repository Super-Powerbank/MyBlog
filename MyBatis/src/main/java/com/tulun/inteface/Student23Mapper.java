package com.tulun.inteface;

import com.tulun.pojo.Student23;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Student23Mapper {


    public List<Student23> selectAllStudent( );

    public List<Student23> selectStudent(Student23 student23);

    //通过id查询学生信息
    @Select("select * from Student where SID = #{uid}")
    public Student23 selectStudentByUid(Long  uid);

    @Select("select * from Student where Sname like #{name}")
    public List<Student23> selectStudentByName(String name);

    @Options(useGeneratedKeys = true,timeout = 1000,useCache = true)
    @Insert("insert into  Student(SID,Sname,Ssex,Sage) values (#{SID},#{Sname},#{Ssex},#{Sage})")
    public int insertStudent(Student23 student);

//    public int updateStudent(Student23 student);

    /**
     * 多个参数的传递，使用注解@param
     * @param SID
     * @param Sname
     */
//    public int updateStudent1(@Param("SID") Long SID ,@Param("Sname") String Sname);
}