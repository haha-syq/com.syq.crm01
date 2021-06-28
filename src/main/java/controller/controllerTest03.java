package controller;

import Instance.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 对象接收参数
 */
@Controller
@RequestMapping(value = "text03/")
public class controllerTest03 {

    @RequestMapping(value = "first.do")
    public ModelAndView doFirst(Student student){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("myname",student.getName());
        modelAndView.addObject("myage",student.getAge());
        modelAndView.setViewName("showTest02");
        return modelAndView;
    }
}
