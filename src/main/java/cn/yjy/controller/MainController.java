package cn.yjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yjy on 16-12-25.
 */

@Controller
public class MainController {

    @RequestMapping({"","/"})
    public String index(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/enrollmanipulator")
    public String manipulator(HttpServletRequest request){
        return "manipulator";
    }
}
