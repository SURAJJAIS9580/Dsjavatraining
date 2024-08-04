import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.Executor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hotel Booking Form");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500, 400);

        JLabel nameLb = new JLabel("NAME :");
        nameLb.setBounds(30, 10, 100, 30);
        frame.add(nameLb);

        JTextField nameText = new JTextField();
        nameText.setBounds(100, 10, 100, 30);
        frame.add(nameText);

        JLabel emailLb = new JLabel("EMAIL :");
        emailLb.setBounds(230, 10, 100, 30);
        frame.add(emailLb);

        JTextField emailText = new JTextField();
        emailText.setBounds(300, 10, 100, 30);
        frame.add(emailText);

        JLabel mobileLb = new JLabel("MOBILE :");
        mobileLb.setBounds(30, 50, 100, 30);
        frame.add(mobileLb);

        JTextField mobileText = new JTextField();
        mobileText.setBounds(100, 50, 100, 30);
        frame.add(mobileText);

        JLabel addressLb = new JLabel("ADDRESS :");
        addressLb.setBounds(230, 50, 100, 30);
        frame.add(addressLb);

        JTextField addressText = new JTextField();
        addressText.setBounds(300, 50, 100, 30);
        frame.add(addressText);

        JLabel genderLb = new JLabel("GENDER :");
        genderLb.setBounds(30, 90, 100, 30);
        frame.add(genderLb);

        JTextField genderText = new JTextField();
        genderText.setBounds(100, 90, 100, 30);
        frame.add(genderText);

        JLabel checkinLb = new JLabel("CHECKIN :");
        checkinLb.setBounds(230, 90, 100, 30);
        frame.add(checkinLb);

        JTextField checkinText = new JTextField();
        checkinText.setBounds(300, 90, 100, 30);
        frame.add(checkinText);

        JLabel checkoutLb = new JLabel("CHECKOUT :");
        checkoutLb.setBounds(30, 130, 100, 30);
        frame.add(checkoutLb);

        JTextField checkoutText = new JTextField();
        checkoutText.setBounds(100, 130, 100, 30);
        frame.add(checkoutText);

        JLabel paymentLb = new JLabel("PAYMENT :");
        paymentLb.setBounds(230, 130, 100, 30);
        frame.add(paymentLb);

        JTextField paymentText = new JTextField();
        paymentText.setBounds(300, 130, 100, 30);
        frame.add(paymentText);

        JButton bookButt = new JButton("BOOK NOW");
        bookButt.setBounds(70, 200, 110, 20);
        frame.add(bookButt);

        JButton clearButt = new JButton("CLEAR ALL");
        clearButt.setBounds(190, 200, 110, 20);
        frame.add(clearButt);

        JButton exitButt = new JButton("EXIT");
        exitButt.setBounds(310, 200, 110, 20);
        frame.add(exitButt);

        JLabel bookingId =new JLabel();
        bookingId.setBounds(50, 250, 400, 30);
        frame.add(bookingId);

        clearButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to clear the form
                nameText.setText("");
                emailText.setText("");
                mobileText.setText("");
                addressText.setText("");
                checkinText.setText("");
                checkoutText.setText("");
                paymentText.setText("");
                genderText.setText("");
            }
        });

        bookButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add the validation of form can't be empty
                if(nameText.getText().toString().isEmpty() ||
                        emailText.getText().toString().isEmpty() ||
                        mobileText.getText().toString().isEmpty() ||
                        addressText.getText().toString().isEmpty() ||
                        checkinText.getText().toString().isEmpty() ||
                        checkoutText.getText().toString().isEmpty() ||
                        genderText.getText().toString().isEmpty() ||
                        paymentText.getText().toString().isEmpty())
                {
                    bookingId.setText("Please fill the details");
                }
                else {
                    String url = "jdbc:mysql://localhost:8080/hoteldb";
                    String username = "root";
                    String password = "";
                    try {
                        Random random = new Random();
                        int id = random.nextInt(999999);
                        bookingId.setText("Your booking is confirmed and booking id: " + id );

                        System.out.println("Database is connected");

                        Connection con = DriverManager.getConnection(url, username, password);
                        String sql = "insert into booking(name , email, mobile, address, gender, checkin, checkout, payment, bookingid)" + "values(?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStmt = con.prepareStatement(sql);
                        preparedStmt.setString(1, nameText.getText().toString());
                        preparedStmt.setString(2, emailText.getText().toString());
                        preparedStmt.setString(3, mobileText.getText().toString());
                        preparedStmt.setString(4, addressText.getText().toString());
                        preparedStmt.setString(5, genderText.getText().toString());
                        preparedStmt.setString(6, checkinText.getText().toString());
                        preparedStmt.setString(7, checkoutText.getText().toString());
                        preparedStmt.setString(8, paymentText.getText().toString());
                        preparedStmt.setString(9, String.valueOf(id));
                        preparedStmt.execute();

                    } catch (SQLException ex) {
                        throw new RuntimeException(ex + "Database is not connected");
                    }

                }
            }


        });

        exitButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}