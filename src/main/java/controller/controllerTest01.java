package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Controller 创建处理器对象，对象放在Spring-MVC的容器中
 */
@Controller
@RequestMapping(value = "text/")
public class controllerTest01 {
    /*
    处理用户发出的请求 Spring-MVC是使用方法来处理
    准备使用doSome方法处理Some.do请求
    @RequestMapping 请求映射 作用是把一个请求地址和一个方法绑定在一起
                    一个请求指定一个方法处理
        属性：
            value 表示表示请求的uri地址（value值必须是唯一的）
            method 表示请求方式 是@RequestMethod的枚举值
     */

    /**
     * @return
     * Model:数据 【请求处理完成后，要显示给用户的数据】
     * View:视图比如JSP
     */
    @RequestMapping(value = "some.do",method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
//        添加数据 框架在请求的最后将数据放到request作用域
        modelAndView.addObject("msg","欢迎使用Spring-MVC做WEB开发");
        modelAndView.addObject("fun","执行doSome方法"+request.getParameter("name"));
//        指定视图,指定视图的完整路径
//        框架对视图执行forward操作 request.getRequestDispather("/show.jsp").forward(...)
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
