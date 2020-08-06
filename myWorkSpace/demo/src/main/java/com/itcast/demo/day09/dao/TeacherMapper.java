package com.itcast.demo.day09.dao;

import com.itcast.demo.day09.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author lichunmiao
 * @date 2020/6/5
 */
public interface TeacherMapper {
   Teacher getTeacherById(int id);
    List<Teacher> getTeacherByCondition(Teacher teacher);

    List<Teacher> getTeacherByConditionChoose(Teacher teacher);

    List<Teacher> getTeacherByIdIn(@Param("ids") List<Integer> ids);

    int updateTeacher(Teacher teacher);

}
