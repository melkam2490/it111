import javax.swing.*;
import java.awt.*;

public class simpleWindow3 {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        final  int WINDOW_WIDTH = 350;

        final int WINDOW_HEIGHT= 250;
        window.setTitle("My simple Window");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.red);
        window.getLocation(null);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JLabel label1 = new JLabel("My First Big Label!!!!");
        label1.setBounds(200, 90, 200, 60);
        JTextField textField1 = new JTextField();
        textField1.setBounds(20, 20, 100, 20);
        window.add(label1);
        window.add(textField1);

        JLabel label2 = new JLabel("My Second Big Label!!!!");
        label2.setBounds(140, 60, 100, 20);
        JTextField textField2 = new JTextField();
        textField2.setBounds(20, 60, 100, 20);
        window.add(label2);
        window.add(textField2);
        window.getContentPane().add(panel);

        window.pack();
        window.setVisible(true);






    }
}


