package SwingProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ADDnumbergame {
    private static int score = 0;
    static int timeLeft = 45; // 45 seconds
    private static Timer timer;
    private static JButton submitbutton = new JButton("Submit");
    private static JTextField inputframe = new JTextField();
    private static JLabel num = new JLabel("");
    private static JLabel num2 = new JLabel("");
    private static JLabel operator = new JLabel("+");
    private static JLabel equalsLabel = new JLabel("=");
    static JLabel timerlabel = new JLabel("TImer:");
    private static JLabel scorelabel = new JLabel();
    public static void main(String[] args) {

        JFrame frame = new JFrame("Addition game");

        frame.setLayout(null);
        frame.setSize(430,320);
        frame.setVisible(true);
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        game(frame);
        randomnum();
        timermethod();
    }
    static void game(JFrame frame) {

        submitbutton.setBounds(150,150,110,40);
        num.setBounds(100,100,50,50);
        num2.setBounds(160,100,50,50);
        operator.setBounds(140,100,50,50);
        inputframe.setBounds(230,110,80,30);
        equalsLabel.setBounds(200,100,50,50);
        timerlabel.setBounds(230,80,60,30);
        scorelabel.setBounds(230,60,60,30);

        submitbutton.addActionListener(new SubmitButtonListener());

        frame.add(submitbutton);
        frame.add(inputframe);
        frame.add(num);
        frame.add(num2);
        frame.add(operator);
        frame.add(equalsLabel);
        frame.add(timerlabel);
        frame.add(scorelabel);

        num.add(new JLabel());
    }

    private static void randomnum(){

        Random rn = new Random();
        int n1 = rn.nextInt(100);
        int n2 = rn.nextInt(100);

        num.setText(String.valueOf(n1));
        num2.setText(String.valueOf(n2));
    }
    private static void timermethod(){
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerlabel.setText("Time: " + timeLeft);
                if (timeLeft <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time's up! Final Score: " + score);
                }
            }
        });
        timer.start();
    }

    private static class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int nm1 = Integer.parseInt(num.getText());
                int nm2 = Integer.parseInt(num2.getText());
                int answer = Integer.parseInt(inputframe.getText());
                if (answer == nm1 + nm2) {
                    score++;
                    scorelabel.setText("Score: " + score);
                    randomnum();
                    inputframe.setText("");
                    timeLeft = 45; // reset timer
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect! Try again.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }

}
