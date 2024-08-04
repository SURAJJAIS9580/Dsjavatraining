import javafx.scene.input.InputMethodTextRun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String username= "root";
        String password= "";
        String url = "jdbc:mysql://localhost:8080/expensedb";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected");

            JFrame frame=new JFrame("EXPENSES");
            JLabel tittlelabel=new JLabel("ADD EXPENSES");
            tittlelabel.setBounds(210, 3, 100, 50);
            tittlelabel.setForeground(Color.BLUE);
            frame.add(tittlelabel);

            JLabel expenseTypeLabel = new JLabel("Enter the Expense Type");
            expenseTypeLabel.setBounds(20, 40, 140, 50);
            expenseTypeLabel.setForeground(Color.black);
            frame.add(expenseTypeLabel);

            JTextField expenseTypeField = new JTextField();
            expenseTypeField.setBounds(190, 50, 140, 30);
            expenseTypeField.setForeground(Color.black);
            frame.add(expenseTypeField);

            JLabel expenseAmountLabel = new JLabel("Enter the Expense Amount");
            expenseAmountLabel.setBounds(20, 90, 160, 50);
            expenseAmountLabel.setForeground(Color.black);
            frame.add(expenseAmountLabel);

            JTextField expenseAmountField = new JTextField();
            expenseAmountField.setBounds(190, 100, 140, 30);
            expenseAmountField.setForeground(Color.black);
            frame.add(expenseAmountField);

            JLabel incomeAmountLabel = new JLabel("Enter the Income Amount");
            incomeAmountLabel.setBounds(20, 140, 160, 50);
            incomeAmountLabel.setForeground(Color.black);
            frame.add(incomeAmountLabel);

            JTextField incomeAmountField = new JTextField();
            incomeAmountField.setBounds(190, 150, 140, 30);
            incomeAmountField.setForeground(Color.black);
            frame.add(incomeAmountField);

            JButton saveButton = new JButton("SAVE");
            saveButton.setBounds(130, 220, 80, 30);
            frame.add(saveButton);

            // to click on the save button

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insertquery= "INSERT INTO expensetb(incomeamount,expensetype,expenseamount) VALUES (?,?,?)";
                    PreparedStatement stmt = null;
                    try {
                        stmt = conn.prepareStatement(insertquery);
                        stmt.setInt(1,Integer.parseInt(incomeAmountField.getText()));
                        stmt.setString(2,expenseTypeField.getText());
                        stmt.setInt(3,Integer.parseInt(expenseAmountField.getText()));
                        stmt.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });




            frame.setSize(500, 400);
            frame.setLayout(null);
            frame.setVisible(true);

            //To insert the data into table
            String insertData= "INSERT INTO expensetb(incomeamount,expensetype,expenseamount) VALUES (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(insertData);

        } catch (SQLException e) {
            throw new RuntimeException("Database is not connected"+e);
        }


    }
}