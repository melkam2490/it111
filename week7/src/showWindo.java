
import javax.swing.*;

public class showWindo {

    public static void main( String[]args){
        JFrame frame;
        JTextField textField;
        JLabel label;




        // declare our variables
        // we are going to make them constant
        final int WINDOW_WIDTH = 350;

        final int WINDOW_HEIGHT= 250;

        // creat a window

        JFrame window = new JFrame();
        JLabel myLabel = new JLabel();
        JLabel mySecond= new JLabel();

        // set title
        window.setTitle("My simple Window");
        // setting the size of our window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        // clothe the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // display the window if we  do not display the window it will not display
        // displaying the window is boolean
        window.setVisible(true);




    }
}


