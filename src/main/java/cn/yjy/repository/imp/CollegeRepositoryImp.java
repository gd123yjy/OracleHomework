package cn.yjy.repository.imp;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.repository.CollegeRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by yjy on 16-12-16.
 */
@Repository
public class CollegeRepositoryImp implements CollegeRepository {


    @Override
    public Set<College> getAllCollege() {
        return null;
    }

    @Override
    public College getBasicCollegeInformation(int cno) {
        return null;
    }

    @Override
    public College getAllCollegeInformation(int cno) {
        return null;
    }

    @Override
    public Set<Student> getStudentSet(Integer cno) {
        return null;
    }
}
