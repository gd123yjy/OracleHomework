package cn.yjy.service;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;

import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */
public interface CollegeService {
    Set<College> findAllCollege();

    College findBasicCollegeInformation(Integer cno);

    College findAllStudentInformation(Integer cno);

    Set<Student> findEnrollListOfCollege(Integer cno);
}
