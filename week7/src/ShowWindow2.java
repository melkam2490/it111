import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main( String[]args){
        // Create a JFrame window
        JFrame window = new JFrame();
        final  int WINDOW_WIDTH = 350;

        final int WINDOW_HEIGHT= 300;
        window.setTitle("My simle Window");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.red);
        window.setLayout(null);
        window.setLocation(100,100);


        // Create the first text field
        JTextField textField1 = new JTextField();
        textField1.setBounds(10, 40, 140, 20);

        window.add(textField1);

        // Create the first label
        JLabel label1 = new JLabel("My First Big Label!!!!");
        label1.setBounds(10, 20, 200, 20);
        label1.setFont(new Font("Verdana", Font.BOLD, 15));

        window.add(label1);

//
        // Create the second text field
        // label1.setFont(new Font("Arial   ", Font.bigger, 12));
        JTextField textField2 = new JTextField();
        textField2.setBounds(10, 100, 140, 20);

        window.add(textField2);


        // Create the second label
        JLabel label2 = new JLabel("My Second Big Label!!!!");
        label2.setBounds(10, 80, 200, 20);
        label2.setFont(new Font("Verdana", Font.PLAIN, 12));

        window.add(label2);


        window.setVisible(true);







    }
}



