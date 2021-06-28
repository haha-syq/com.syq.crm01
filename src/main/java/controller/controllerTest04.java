package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "text04/")
public class controllerTest04 {
    /*
    处理方法返回String--表示逻辑视图名称，需要配置视图解析器
    如果使用完整视图名称，此时不能配置视图解析器，从完整路劲下开始/WEB-INF/view/showTest03.jsp
     */
    @RequestMapping(value = "returnString-View.do")
    public String doReturnString$View(HttpServletRequest request, String name, Integer age){
        System.out.println(name+age);
        //也可以手动添加数据到请求作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        return "showTest03";
    }
}
