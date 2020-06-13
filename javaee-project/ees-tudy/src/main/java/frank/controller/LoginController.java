package frank.controller;

import frank.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login.html";
    }
    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    @ResponseBody
    public Object login2(){
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123");
        return user;
    }
}
