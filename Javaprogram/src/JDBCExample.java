import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
    private static Connection mysqlConnection;

    public static void main(String[] args) {
       //establish the database connection
        //1. url,username,password,database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:8080/javaTraining";
        // to make the connection
        try {
            Connection conn = DriverManager.getConnection(url,username, password);
            System.out.println("Database connection established");
            String query= "INSERT INTO trainer VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1,null);
            stmt.setString(2,"mohit");
            stmt.setString(3,"mohit98357@gmail.com");
            stmt.setString(4,"3984578494");
            stmt.setString(5,"java");
            stmt.setString(6,"noida");
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Do not connected"+e);
        }
    }
}
