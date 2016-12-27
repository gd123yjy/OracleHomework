package cn.yjy.configuration;

import cn.yjy.condition.MyCondition;
import cn.yjy.controller.MainController;
import cn.yjy.repository.CollegeRepository;
import cn.yjy.repository.imp.CollegeRepositoryImp;
import cn.yjy.service.CollegeService;
import cn.yjy.service.StudentService;
import cn.yjy.service.imp.CollegeServiceImp;
import cn.yjy.service.imp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import cn.yjy.repository.StudentRepository;
import cn.yjy.repository.imp.StudentRepositoryImp;

/**
 * Created by yjy on 16-12-16.
 */

@Configuration
@ComponentScan(basePackageClasses = MainController.class)
public class MyConfiguration {
    @Bean
    public StudentService studentService(@Qualifier("priority1") StudentRepository studentRepository){
        return new StudentServiceImp(studentRepository);
    }

    @Bean
    public CollegeService collegeService(CollegeRepository collegeRepository){
        return new CollegeServiceImp(collegeRepository);
    }

    @Bean
    @Qualifier("priority1")
    @Conditional(MyCondition.class)
    public StudentRepository studentRepository(@Value("${myRepository.message}") String message){
        return new StudentRepositoryImp();
    }

    @Bean
    @Conditional(MyCondition.class)
    public CollegeRepository collegeRepository(@Value("${myRepository.message}") String message){
        return new CollegeRepositoryImp();
    }
}
