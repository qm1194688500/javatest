import java.sql.*;
import java.util.Scanner;

public class BlogSystem {
    private static Connection connection;
    private static User currentUser;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/java20_20191218?useSSL=false",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("====================");
            System.out.println("1. 注册用户");
            System.out.println("2. 登陆用户");
            System.out.println("其他. 退出");
            System.out.println("====================");
            System.out.print("博客系统> ");
            int select = scanner.nextInt();
            switch (select) {
                case 1: registerUser(); break;
                case 2: loginUser(); break;
                default: running = false;
            }
        }
    }

    private static void loginUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要登陆的用户名");
        String username = scanner.nextLine();
        Statement statement = connection.createStatement();
        String sql = String.format(
                "SELECT id FROM users WHERE username = '%s'",
                username
        );
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int id = resultSet.getInt(1);
        currentUser = new User(id, username);
        resultSet.close();
        statement.close();
        System.out.printf("欢迎回来 %s(%d)%n", username, id);
    }

    private static void registerUser() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String username = scanner.nextLine();
        Statement statement = connection.createStatement();
        String sql = String.format(
                "INSERT INTO users (username) VALUES ('%s')",
                username
        );
        try {
            statement.executeUpdate(sql);
            System.out.println("用户注册成功");
        } catch (SQLException e) {
            System.out.println("用户名已被占用，请选择其他用户名");
        }
        statement.close();
    }
}