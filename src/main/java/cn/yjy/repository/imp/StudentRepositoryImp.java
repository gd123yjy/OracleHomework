package cn.yjy.repository.imp;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.repository.StudentRepository;
import cn.yjy.repository.rowMapper.SimpleCollegeRowMapper;
import cn.yjy.repository.rowMapper.SimpleStudentRowMapper;
import cn.yjy.repository.rowMapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yjy on 16-12-16.
 */
@Repository
public class StudentRepositoryImp implements StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private StudentRowMapper studentRowMapper = new StudentRowMapper();

    private SimpleCollegeRowMapper simpleCollegeRowMapper = new SimpleCollegeRowMapper();

    @Override
    public List<Student> getAllStudent() {
        return jdbcTemplate.query("select * from YJY_HOMEWORK.STUDENT",new Object[]{}, studentRowMapper);
    }

    @Override
    public Student getBasicInformation(int sno) {
        return jdbcTemplate.queryForObject("select * from YJY_HOMEWORK.STUDENT WHERE STUDENT_NUMBER=?",new Object[]{sno}, studentRowMapper);
    }

    @Override
    public Student getAllInformation(int sno) {
        Student student = getBasicInformation(sno);
        // TODO: 17-1-1
        //student.setAspiration1();
        return student;
    }

    @Override
    public College getEnrollCollege(int sno) {
        try {
            return jdbcTemplate.queryForObject("select * from YJY_HOMEWORK.ENROLL_RESULT WHERE SNO=?",new Object[]{sno}, simpleCollegeRowMapper);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
