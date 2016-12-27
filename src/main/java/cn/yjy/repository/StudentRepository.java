package cn.yjy.repository;

import cn.yjy.pojo.Student;

import java.util.Set;

/**
 * Created by yjy on 16-12-16.
 */
public interface StudentRepository {

    Set<Student> getAllStudent();
    Student getBasicInformation(int sno);
    Student getAllInformation(int sno);
    String getEnrollCollege(int sno);
}
