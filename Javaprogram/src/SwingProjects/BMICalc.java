package SwingProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalc{
    public static void GuiJava() {


        // to create a frame using swing in java
        JFrame frame =new JFrame("BMI Calculator");
        //create UI components for BMI calculator

        JLabel heightLabel = new JLabel( "Enter your Height(m)");
        JLabel weightLabel = new JLabel( "Enter your Weight(kg)");
        JLabel bmiLabel = new JLabel();

        JTextField weightField=new JTextField();
        JTextField heightField=new JTextField();

        JButton bmiButton = new JButton("Calculate BMI");
        // to set the size and position of UI components
        heightLabel.setBounds(30, 30, 150, 40);
        heightField.setBounds(180, 30, 50, 40);
        weightLabel.setBounds(30, 70, 150, 40);
        weightField.setBounds(180, 80, 50, 40);
        bmiButton.setBounds(90, 130, 120, 40);
        bmiLabel.setBounds(30, 170, 250, 40);
        // to attach the UI components to Frame
        frame.add(bmiLabel);
        frame.add(bmiButton);
        frame.add(weightField);
        frame.add(weightLabel);
        frame.add(heightField);
        frame.add(heightLabel);
        // to bliud the default layout
        frame.setLayout(null);
        //to set the size of frame
        frame.setSize(300, 250);
        // to visible the frame on screen
        frame.setVisible(true);

        // to click on the BMI calculate button operation
        bmiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply the bmi formula
                float weight = Float.parseFloat(weightField.getText());
                float height = Float.parseFloat(weightField.getText());
                float output = weight/(height*height);
                //18.5 < under weight , 18.5 to 24.9 = normal, 24.9 to 29.9 ovwrweight, 29 > obesity
                if ( output< 18.5){
                    bmiLabel.setText("Im under wight");
                    bmiLabel.setBackground(Color.red);
                    bmiLabel.setBackground(Color.red);

                } else if (output>18.5 && output < 24.9) {
                    bmiLabel.setText("Im normal");
                    bmiLabel.setBackground(Color.green);
                    bmiLabel.setForeground(Color.green);

                } else if (output>24.9 && output<29.9) {
                    bmiLabel.setText("Im Over wight");
                    bmiLabel.setBackground(Color.yellow);
                    bmiLabel.setForeground(Color.yellow);

                }else {
                    bmiLabel.setText("Im obesity");
                    bmiLabel.setBackground(Color.red);
                    bmiLabel.setForeground(Color.red);
                }
            }
        });

    }

    public static void main(String[] args) {
        GuiJava();
    }


}
