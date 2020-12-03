package reqs.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 系统测试接口，测试系统是否正常。
 *  TODO 可能会被黑客针对
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        // 小测试方法
        String returnStr = doATest();
        if(returnStr!=null){
            return  returnStr;
        }
        return "Greetings from Spring Boot!";
    }

    String doATest(){
        StringBuilder stringBuilder = new StringBuilder();
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Enumeration<String> reqHeadInfos = request.getHeaderNames();//获取所有的请求头
        while (reqHeadInfos.hasMoreElements()) {
                    String headName = (String) reqHeadInfos.nextElement();
                    String headValue = request.getHeader(headName);//根据请求头的名字获取对应的请求头的值
                    if(headName.equals("user-agent"))
                         stringBuilder.append(headName).append(":\t").append(headValue).append(";\r\n");
        }
        return stringBuilder.toString();
    }

}