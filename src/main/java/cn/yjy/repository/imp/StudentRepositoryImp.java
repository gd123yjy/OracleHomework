package cn.yjy.repository.imp;

import cn.yjy.pojo.Student;
import cn.yjy.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by yjy on 16-12-16.
 */
@Repository
public class StudentRepositoryImp implements StudentRepository {

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getBasicInformation(int sno) {
        return null;
    }

    @Override
    public Student getAllInformation(int sno) {
        return null;
    }

    @Override
    public String getEnrollCollege(int sno) {
        return null;
    }
}
