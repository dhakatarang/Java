package JFrame;

import javax.swing.*;  
import java.awt.event.*;  

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");


        JLabel label = new JLabel("Hello, Sweetheart! ❤️");
        label.setBounds(50, 50, 200, 30);


        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked me 😍");
            }
        });

        
        frame.add(label);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
