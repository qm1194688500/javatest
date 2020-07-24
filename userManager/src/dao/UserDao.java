package dao;

import entiy.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserDao {
    public  User login(User loginUser){
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
    public  int add(User addUser) {
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
    public  int delete(int id){
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
    public  User find(int id){
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
    public  int update(User updateUser){
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
    public List<User> findByPage(int start, int rows, Map<String,String[]> map){
        List<User> users = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from usermessage where 1=1";
        StringBuilder sb = new StringBuilder(sql);
        Set<String> set = map.keySet();
        List<Object> list = new ArrayList<>();

        for ( String key: set) {
            String value = map.get(key)[0];
            if (value!=null&&!"".equals(value)){
                sb.append(" and ").append(key).append(" like ? ");
                list.add("%" + value + "%");
            }
        }
        sb.append(" limit ?,? ");
        list.add(start);
        list.add(rows);
        try{
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(sb.toString());
            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAddress(rs.getString("address"));
                user.setAge(rs.getInt("age"));
                user.setGender(rs.getString("gender"));
                user.setQq(rs.getString("qq"));
                user.setEmail(rs.getString("email"));
                users.add(user);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return users;
    }
    public static void setValues(PreparedStatement ps,Object... arrays) throws SQLException {
        for (int i = 0; i <arrays.length ; i++) {
            ps.setObject(i+1,arrays[i]);

        }
    }
    public  int findAllRecord(Map<String, String[]> map){
        String sql = "select count(*) form usermessage where 1=1";
        StringBuilder s = new StringBuilder();
        s.append(sql);
        Set<String> keySet = map.keySet();
        List<Object> list = new ArrayList<>();
        for (String key: keySet ) {
            String value = map.get(key)[0];
            if (value!=null&&!"".equals(value)){
                s.append(" and ").append(key).append(" like ?");
                list.add("%"+value+"%");
            }
        }
        System.out.println("findAllRecord::sql" + s);
        System.out.println("findAllRecord::list"+list);
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            connection = DBUtil.getConnection();
            ps = connection.prepareStatement(s.toString());
            setValues(ps,list.toArray());
            rs = ps.executeQuery();
            if (rs.next()){
                count = rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,ps,rs);
        }
        return count;
    }
    /*public static void main(String[] args) {
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
        Map<String,String[]> map = new HashMap<>();
        String[] names = {"张"};
        map.put("name",names);
        String[] addresses = {""};
        map.put("address",addresses);
        String[] emails = {""};
        map.put("email",emails);
        List<User> userList = findByPage(0,5,map);
        for (User u:userList) {
            System.out.println(u);
        }

    }*/
}
