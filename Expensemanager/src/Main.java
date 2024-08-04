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
        // pass the database url,username,password in string
        String url = "jdbc:mysql://localhost:8080/expensedb";
        String username = "root";
        String password = "";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database is Connected");
            //design the java UI Frame for expense Calculator
            JFrame frame = new JFrame("Suraj Expenses");

            JLabel tittleLabel = new JLabel("Expenses");
            tittleLabel.setBounds(210, 10, 60, 50);
            tittleLabel.setForeground(Color.BLUE);
            frame.add(tittleLabel);

            JLabel expensetypeLabel = new JLabel("Enter Expense Type");
            expensetypeLabel.setBounds(40, 50, 150, 50);
            expensetypeLabel.setForeground(Color.BLACK);
            frame.add(expensetypeLabel);

            JLabel expenseamountLabel = new JLabel("Enter Expense Amount");
            expenseamountLabel.setBounds(40, 100, 150, 50);
            expenseamountLabel.setForeground(Color.BLACK);
            frame.add(expenseamountLabel);

            JLabel incomeamountLabel = new JLabel("Enter Income Amount");
            incomeamountLabel.setBounds(40, 150, 150, 50);
            incomeamountLabel.setForeground(Color.BLACK);
            frame.add(incomeamountLabel);

            JTextField expensetypeField = new JTextField();
            expensetypeField.setBounds(180, 60, 100, 30);
            frame.add(expensetypeField);

            JTextField expenseamountField = new JTextField();
            expenseamountField.setBounds(180, 110, 100, 30);
            frame.add(expenseamountField);

            JTextField incomeamountField = new JTextField();
            incomeamountField.setBounds(180, 160, 100, 30);
            frame.add(incomeamountField);

            JButton savebutton = new JButton("Save");
            savebutton.setBounds(140, 220, 80,20 );
            frame.add(savebutton);

            //to click on the save button
            savebutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String insertquery = "insert into expensetb(incomeamount,expensetype,expenseamount) value(?,?,?)";
                    PreparedStatement ps = null;
                    try {
                        ps = con.prepareStatement(insertquery);
                        ps.setInt(1, Integer.parseInt(incomeamountField.getText()));
                        ps.setString(2, expensetypeField.getText());
                        ps.setInt(3, Integer.parseInt(expenseamountField.getText()));
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            });

            frame.setSize(500, 400);
            frame.setLayout(null);
            frame.setVisible(true);

            //to insert the data into table
            String insertquery = "insert into expensetb(incomeamount,expensetype,expenseamount) value(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertquery);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        }
    }
