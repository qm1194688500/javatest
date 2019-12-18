//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        //1.注册 Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String ur1 = "jdbc:mysql://127.0.0.1/test?useSSL=false";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(
                ur1,
                username,
                password
        );
        //3.获取语句 Statement
        Statement statement = connection.createStatement();
        //4.执行一条 SELECT DATABASE();
        String sql = "SELECT DATABASE()";
        ResultSet resultSet = statement.executeQuery(sql);
        //5.事先知道结果只有一行加一列
        resultSet.next();
        String name = resultSet.getString(1);
        System.out.println(name);
        //-3.关闭结果集（resultSet）
        resultSet.close();


        sql = "SELECT name ,height,weight FROM students ORDER BY weight";
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String nam = resultSet.getString(1);
            Double height = resultSet.getDouble(2);
            int weight = resultSet.getInt(3);
            System.out.println(nam+"," + height +"," + weight);
        }
        resultSet.close();
        //-2.关闭语句
        statement.close();
        //-1.关闭连接
        connection.close();
       // System.out.println(connection);
    }
}
