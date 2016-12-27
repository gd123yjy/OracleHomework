package cn.yjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yjy on 16-12-25.
 */

@Controller
public class MainController {

    @RequestMapping({"","/"})
    public String index(HttpServletRequest request){
        return "index.html";
    }

    @RequestMapping("/enrollmanipulator")
    public String manipulator(HttpServletRequest request){
        return "manipulator.html";
    }

    // TODO: 16-12-27 404,原因不详
    @RequestMapping("/enrollmanipulator/resetenroll")
    public String initManipulator(HttpServletRequest request){
        return "manipulator.html";
    }

    // TODO: 16-12-27 404,原因不详
    @RequestMapping("/enrollmanipulator/autoenroll")
    public String startManipulator(HttpServletRequest request){
        return "manipulator.html";
    }
}
