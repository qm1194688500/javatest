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
        try {
            String sql = "select * from usermessage where username=? and password=?";
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
}
