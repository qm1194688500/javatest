package service;

import dao.PageBean;
import dao.UserDao;
import entiy.User;

import java.util.List;
import java.util.Map;

public class UserService {
    public User login(User loginUser){
        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);
        return user;
    }
    public int add(User user){
        UserDao userDao = new UserDao();
        int ret = userDao.add(user);
        return ret;
    }
    public int delete(int id){
        UserDao userDao = new UserDao();
        int ret = userDao.delete(id);
        return ret;
    }
    public User find(int id){
        UserDao userDao = new UserDao();
        User user = userDao.find(id);
        return user;
    }
    public int updataUser(User upUser){
        UserDao userDao = new UserDao();
        int ret = userDao.update(upUser);
        return ret;
    }
    public PageBean<User> findAllByPage(int currentPage, int rows, Map<String,String[]> map){
        PageBean<User> pageBean = new PageBean<>();
        UserDao userDao = new UserDao();
        int totalCount = userDao.findAllRecord(map);
        int totalPage ;
        if (totalCount%rows!=0){
            totalPage = totalCount/rows+1;
        }else{
            totalPage = totalCount/rows;
        }
        int start = (currentPage-1)*rows;
        List<User> userList = userDao.findByPage(start,rows,map);
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);
        pageBean.setList(userList);
        pageBean.setCurrentPage(currentPage);
        pageBean.setRows(rows);
        return pageBean;
    }
}
