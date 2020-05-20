package util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/cash";
    private static final String USENAME = "root";
    private static final String PASSWORD = "";
    private static volatile DataSource DATASOURCE;

    //数据库连接池
    private static DataSource getDATASOURCE(){
        if (DATASOURCE==null){
            synchronized (DBUtil.class){
                if (DATASOURCE==null){
                    DATASOURCE = new MysqlDataSource();
                    ((MysqlDataSource)DATASOURCE).setUrl(URL);
                    ((MysqlDataSource)DATASOURCE).setUrl(USENAME);
                    ((MysqlDataSource)DATASOURCE).setUrl(PASSWORD);
                }
            }
        }
        return DATASOURCE;
    }
    public static Connection getConnection(boolean autocommit){
        try {
            Connection connection = getDATASOURCE().getConnection();
            connection.setAutoCommit(autocommit);
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection con, PreparedStatement ps, ResultSet rs){
        try {
            if (rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (con!=null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
