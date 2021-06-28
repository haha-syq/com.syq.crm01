package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "text02/")
public class controllerTest02 {
    /*
    逐个接收请求参数
    要求：处理器方法的形参名把必须和请求中参数名保持一致
    同名的请求参数赋值给请求的形参

    框架接收请求参数
        1、使用request对象接收请求参数
        String strName=request.getParameter("name");
        String strAge=request.getParameter("age");
        2、SpringMVC框架通过DispatcherServlet调用controllerTest02的doFirst方法
        调用方法时，按名称对应，把接受的参数赋给形参
        doFirst(strName,Integer.valueOf(strAge))
        框架提供类型转换功能


     使用post提交 请求参数有乱码
     */
    @RequestMapping(value = "first.do",method = RequestMethod.POST)
    public ModelAndView doFirst(String name, Integer age) {
//        request.setCharacterEncoding("UTF-8");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("myname",name);
        modelAndView.addObject("myage",age);
        modelAndView.setViewName("showTest01");
        return modelAndView;
    }
    /*
    @RequestParam
    value：请求中参数名称
    required=true: 表示请求中必须有这个参数
    校正参数名称
     */
    @RequestMapping(value = "second.do",method = RequestMethod.POST)
    public ModelAndView doSecond(@RequestParam(value = "rname",required = false) String name, @RequestParam(value = "rage") Integer age){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("myname",name);
        modelAndView.addObject("myage",age);
        modelAndView.setViewName("showTest01");
        return modelAndView;
    }
}
