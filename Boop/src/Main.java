import javax.swing.*;
import java.awt.*;

public class Main {

    private static void boop(){
        //Create and set up the window.
        JFrame frame = new JFrame("Boop");

        //Create a Button and Panel
        JButton button = new JButton("Boop");
        JPanel panel = new JPanel();

        //Add the Button to the Panel
        panel.add(button);

        //Add Action Listener to the Button
        button.addActionListener(e -> {
            System.out.println("Boop");
            JOptionPane.showMessageDialog(frame, "Boop");
        });

        //Add the Panel to the Frame
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
    
        //Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add an empty label to create space
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //Main method to run the application
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            //Create and show the GUI
            public void run() {
                boop();
            }
        });
    }
}
