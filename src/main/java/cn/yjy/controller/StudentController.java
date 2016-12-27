package cn.yjy.controller;

import cn.yjy.pojo.Student;
import cn.yjy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by yjy on 16-12-27.
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/student")
    public Set<Student> listStudent(){
        return studentService.findAllStudent();
    }

    @RequestMapping("/student/{sno}")
    public Student findStudent(@PathVariable Integer sno){
        return studentService.findBasicStudentInformation(sno);
    }

    @RequestMapping("/student/{sno}/details")
    public Student findStudentDetails(@PathVariable Integer sno){
        return studentService.findAllStudentInformation(sno);
    }

    @RequestMapping("/student/{sno}/enrollcollege")
    public String findEnrollCollegeOfStudent(@PathVariable Integer sno){
        return studentService.findEnrollCollegeOfStudent(sno);
    }
}
