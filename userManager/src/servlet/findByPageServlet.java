package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.PageBean;
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

@WebServlet("/findByPageServlet")
public class FindByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String currentPage = req.getParameter("currentPage");
        String rows = req.getParameter("rows");

        Map<String, String[]> parMap=req.getParameterMap();
        Map<String, String[]> map = new HashMap<>(parMap);
        map.remove("currentPage");
        map.remove("rows");
        int curPage = Integer.parseInt(currentPage);
        int rowsInt = Integer.parseInt(rows);
        UserService userService = new UserService();
        PageBean<User> pageBean = userService.findAllByPage(curPage,rowsInt,map);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),pageBean);
    }
}
