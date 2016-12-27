package cn.yjy.service.imp;

import cn.yjy.pojo.Student;
import cn.yjy.repository.StudentRepository;
import cn.yjy.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */
@Service
public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.getAllStudent();
    }

    @Override
    public Student findBasicStudentInformation(Integer sno) {
        return studentRepository.getBasicInformation(sno);
    }

    @Override
    public Student findAllStudentInformation(Integer sno) {
        return studentRepository.getAllInformation(sno);
    }

    @Override
    public String findEnrollCollegeOfStudent(Integer sno) {
        return studentRepository.getEnrollCollege(sno);
    }
}
