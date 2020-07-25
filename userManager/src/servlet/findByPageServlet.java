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
import java.util.Arrays;
import java.util.Map;

@WebServlet("/findByPageServlet")
public class findByPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String currentPage = req.getParameter("currentPage");
        String rows = req.getParameter("rows");

        Map<String, String[]> parMap=req.getParameterMap();
        for (Map.Entry<String,String[]> entry: parMap.entrySet()
             ) {
            System.out.println("key"+entry.getKey()+"value"+Arrays.toString(entry.getValue()));
        }
        int curPage = Integer.parseInt(currentPage);
        int rowsInt = Integer.parseInt(rows);
        UserService userService = new UserService();
        PageBean<User> pageBean = userService.findAllByPage(curPage,rowsInt,parMap);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(resp.getWriter(),pageBean);
    }
}
