package cn.yjy.repository.imp;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.repository.CollegeRepository;
import cn.yjy.repository.rowMapper.SimpleStudentRowMapper;
import cn.yjy.repository.rowMapper.CollegeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yjy on 16-12-16.
 */
@Repository
public class CollegeRepositoryImp implements CollegeRepository {

    //spring boot 自带默认jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private CollegeRowMapper collegeRowMapper = new CollegeRowMapper();

    private SimpleStudentRowMapper simpleStudentRowMapper = new SimpleStudentRowMapper();

    @Override
    public List<College> getAllCollege() {
        return jdbcTemplate.query("SELECT * FROM YJY_HOMEWORK.COLLEGE", new Object[]{}, collegeRowMapper);
    }

    @Override
    public College getBasicCollegeInformation(int cno) {
        return jdbcTemplate.queryForObject("SELECT * FROM YJY_HOMEWORK.COLLEGE WHERE college_number=?",new Object[]{cno},collegeRowMapper);
    }

    @Override
    public College getAllCollegeInformation(int cno) {
        College college = getBasicCollegeInformation(cno);
        college.setStudents(getStudentList(cno));
        return college;
    }

    @Override
    public List<Student> getStudentList(Integer cno) {
        return jdbcTemplate.query("select * from YJY_HOMEWORK.ENROLL_RESULT WHERE CNO=?",new Object[]{cno}, simpleStudentRowMapper);
    }

}
