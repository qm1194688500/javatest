package dao;

import entiy.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public static User login(User loginUser){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        String sql = "select * from usermessage where username=? and password=?";
        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1,loginUser.getUsername());
            ps.setString(2,loginUser.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setQq(rs.getString("qq"));
                user.setEmail(rs.getString("email"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,ps,rs);
        }
        return user;
    }
    public static int add(User addUser) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            String sql="insert into usermessage(name, username, password, gender, age, address, qq, email) values (?,?,?,?,?,?,?,?)";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, addUser.getName());
            ps.setString(2, addUser.getUsername());
            ps.setString(3, addUser.getPassword());
            ps.setString(4, addUser.getGender());
            ps.setInt(5, addUser.getAge());
            ps.setString(6, addUser.getAddress());
            ps.setString(7, addUser.getQq());
            ps.setString(8,addUser.getEmail());
            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,null);
        }
        return 0;
    }
    public static int delete(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "delete from usermessage where id=?";
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            int ret = ps.executeUpdate();
            return ret;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return 0;
    }
    public static User find(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        String sql = "select * from usermessage where id=?";
        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setQq(rs.getString("qq"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return user;
    }
    public static int update(User updateUser){
        Connection connection = null;
        PreparedStatement ps = null;
        String sql = "update usermessage set name=?,age=?,gender=?,address=?,email=? where id=?";
        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, updateUser.getId());
            ps.setInt(2,updateUser.getAge());
            ps.setString(3, updateUser.getGender());
            ps.setString(4, updateUser.getAddress());
            ps.setString(5, updateUser.getQq());
            ps.setString(6, updateUser.getEmail());
            int ret = ps.executeUpdate();
            return ret;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,null);
        }
        return 0;
    }
    public static void main(String[] args) {
        User user = new User();
        user.setName("马宁");
        user.setUsername("xiaoma");
        user.setPassword("123456");
        user.setAddress("陕西");
        user.setAge(18);
        user.setGender("男");
        user.setQq("5201314");
        user.setEmail("44611566");
        if (add(user)==0){
            System.out.println("添加失败");
        }else{
            System.out.println("添加成功");
        }
    }
}
