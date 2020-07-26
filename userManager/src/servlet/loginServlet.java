package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entiy.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json:charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username"+username);
        System.out.println("password"+password);
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        UserService userService = new UserService();
        User user = userService.login(loginUser);
        Map<String,Object> returnMap = new HashMap<>();
        if (user!=null){
            System.out.println("登陆成功！"+username );
            req.getSession().setAttribute("user",user);
            returnMap.put("msg",true);
        }else{
            System.out.println("登陆失败"+username);
            returnMap.put("msg",false);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),returnMap);

    }
}
