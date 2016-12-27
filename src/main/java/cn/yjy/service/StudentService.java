package cn.yjy.service;

import cn.yjy.pojo.Student;

import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */
public interface StudentService {
    Set<Student> findAllStudent();

    Student findBasicStudentInformation(Integer sno);

    Student findAllStudentInformation(Integer sno);

    String findEnrollCollegeOfStudent(Integer sno);
}
