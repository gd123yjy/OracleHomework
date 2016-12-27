package cn.yjy.controller;

import cn.yjy.pojo.College;
import cn.yjy.pojo.Student;
import cn.yjy.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */
@RestController
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    public CollegeService getCollegeService() {
        return collegeService;
    }

    public void setCollegeService(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @RequestMapping("/college")
    public Set<College> listCollege(){
        return collegeService.findAllCollege();
    }

    @RequestMapping("/college/{cno}")
    public College findCollege(@PathVariable Integer cno){
        return collegeService.findBasicCollegeInformation(cno);
    }

    @RequestMapping("/college/{cno}/details")
    public College findCollegeDetails(@PathVariable Integer sno){
        return collegeService.findAllStudentInformation(sno);
    }

    @RequestMapping("/student/{cno}/enrolllist")
    public Set<Student> findEnrollListOfCollege(@PathVariable Integer cno){
        return collegeService.findEnrollListOfCollege(cno);
    }
}
