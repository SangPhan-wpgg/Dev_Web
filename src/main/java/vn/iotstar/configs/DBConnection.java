package vn.iotstar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String DATABASE_NAME = "LTWeb"; // Tên cơ sở dữ liệu
    private static final String SERVER_NAME = "localhost";
    private static final String PORT_NUMBER = "1433";

    // Chuỗi kết nối bằng Windows Authentication
    private static final String URL = "jdbc:sqlserver://" + SERVER_NAME + ":" + PORT_NUMBER +
            ";databaseName=" + DATABASE_NAME +
            ";integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL);
            System.out.println("Kết nối đến cơ sở dữ liệu thành công!");
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy Driver JDBC.");
            throw new SQLException("SQL Server JDBC Driver không được tìm thấy.", e);
        }
        return connection;
    }
}