package com.william.dao;

import com.william.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {


       // List<Teacher> getTeacher();

        Teacher getTeacher(@Param("tid") int id);


}
