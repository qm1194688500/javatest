package frank.controller;

import frank.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/1")
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "/login.html";
    }
    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    @ResponseBody
    public Object login2(){
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123");
        return user;
    }
    @RequestMapping(value = "/login3",method = RequestMethod.POST)
    @ResponseBody
    public Object login3(@RequestBody User u){
        System.out.println(u);
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123");
        return user;
    }
    @RequestMapping(value = "/login4",method = RequestMethod.POST)
    @ResponseBody
    public Object login4(HttpServletRequest request, HttpServletResponse response,User u){
        if ("abc".equals(u.getUsername())&&"123".equals(u.getPassword())){
            HttpSession session = request.getSession();
            session.setAttribute("user",u);
        }
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123");
        return user;
    }

}
