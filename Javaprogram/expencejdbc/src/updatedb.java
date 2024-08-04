import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updatedb {
    public static void main(String[] args) {

        String username= "root";
        String password= "";
        String url = "jdbc:mysql://localhost:8080/expensedb";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected");

            String updateData= "UPDATE expensetb set expensetype = ?, expenseamount = ?";
            PreparedStatement stmt = conn.prepareStatement(updateData);

            stmt.setString(1,"food");
            stmt.setInt(2,200);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Database is not connected"+e);
        }


    }
}
