package cn.yjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/enrollmanipulator",method = RequestMethod.GET)
    public ModelAndView manipulator(ModelAndView modelAndView){
        modelAndView.setViewName("manipulator.html");
        return modelAndView;
    }

    @RequestMapping(value = "/enrollmanipulator",method = RequestMethod.POST)
    public @ResponseBody String manipulator_POST(@RequestParam("request_type") Integer request_type){
        if (request_type == 1){
            // TODO: 17-1-3 调用自动投档
            return  "自动投档已完成";
        }else if (request_type == 2){
            // TODO: 17-1-3 调用一键还原
            return "一键还原已完成";
        }else {
            return "请求格式错误";
        }
    }
}
