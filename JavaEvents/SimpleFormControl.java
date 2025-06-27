package JavaEvents;
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
  
  public class SimpleFormControl extends JFrame {
  
      private JTextField nameField, emailField;
      private JButton submitButton;
      private JLabel outputLabel;
  
      public SimpleFormControl() {
          // Frame settings
          setTitle("Simple Form Control");
          setSize(350, 250);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLayout(new GridLayout(5, 2, 10, 10));
  
          // Create components
          JLabel nameLabel = new JLabel("Name:");
          nameField = new JTextField();
  
          JLabel emailLabel = new JLabel("Email:");
          emailField = new JTextField();
  
          submitButton = new JButton("Submit");
  
          outputLabel = new JLabel("");
          outputLabel.setForeground(Color.BLUE);
  
          // Add event to submit button
          submitButton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  String name = nameField.getText().trim();
                  String email = emailField.getText().trim();
  
                  if (name.isEmpty() || email.isEmpty()) {
                      outputLabel.setText("Please fill all fields!");
                  } else {
                      outputLabel.setText("Hello, " + name + "! Email: " + email);
                  }
              }
          });
  
          // Add components to frame
          add(nameLabel);
          add(nameField);
          add(emailLabel);
          add(emailField);
          add(new JLabel()); // Empty cell for spacing
          add(submitButton);
          add(new JLabel("Output:"));
          add(outputLabel);
  
          setVisible(true);
      }
  
      public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> new SimpleFormControl());
      }
  }


