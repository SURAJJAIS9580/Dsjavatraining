import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //pass the mysql database url to string
        String url = "jdbc:mysql://localhost:8080/jdbcsecj";
        //database credentials pass to string
        String username = "root";
        String password = "";
        //make the connection between jdbc to mysql
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected");

            String query= "INSERT INTO registerstudent VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1,null);
            stmt.setString(2,"aditiya");
            stmt.setString(3,"ashfouds83753@gmail.com");
            stmt.setString(4,"CSE");
            stmt.setString(5,"38");
            stmt.setString(6,"3");
            stmt.setString(7,"CS32");
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Database is not connected" + e.getMessage());
        }

    }
}