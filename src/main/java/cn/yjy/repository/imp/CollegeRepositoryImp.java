package cn.yjy.repository.imp;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public List<College> getAllCollege() {
        return jdbcTemplate.query("SELECT * FROM YJY_HOMEWORK.COLLEGE", new Object[]{}, collegeRowMapper);
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
    public List<Student> getStudentSet(Integer cno) {
        return null;
    }

    class CollegeRowMapper implements RowMapper{

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                College college = new College();
                college.setNumber(resultSet.getInt("COLLEGE_NUMBER"));
                college.setName(resultSet.getString("COLLEGE_NAME"));
                college.setBorderline(resultSet.getInt("BORDERLINE"));
                college.setTagetEnroll(resultSet.getInt("TARGETENROLL"));
                college.setActualEnroll(resultSet.getInt("ACTUALENROLL"));
                return college;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
