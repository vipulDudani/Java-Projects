import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApplicationn {

    public static void main(String[] args) {

        // Create a JFrame to hold the components
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Add a label and a text field for name input
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 20);
        panel.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(130, 20, 200, 20);
        panel.add(nameField);

        // Add a label and a password field for password input
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 50, 100, 20);
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(130, 50, 200, 20);
        panel.add(passwordField);

        // Add a label and a text area for address input
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 80, 100, 20);
        panel.add(addressLabel);
        JTextArea addressArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(addressArea);
        scrollPane.setBounds(130, 80, 200, 80);
        panel.add(scrollPane);

        // Add a check box for newsletter subscription
        JCheckBox newsletterCheckBox = new JCheckBox("Subscribe to newsletter");
        newsletterCheckBox.setBounds(20, 180, 200, 20);
        panel.add(newsletterCheckBox);

        // Add radio buttons for gender selection
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 210, 100, 20);
        panel.add(genderLabel);
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        maleRadioButton.setBounds(130, 210, 100, 20);
        femaleRadioButton.setBounds(230, 210, 100, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);

        // Add a command button for submitting the form
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 250, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();
                String gender = "";
                if (maleRadioButton.isSelected()) {
                    gender = "Male";
                } else if (femaleRadioButton.isSelected()) {
                    gender = "Female";
                }
                String newsletter = newsletterCheckBox.isSelected() ? "Yes" : "No";
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAddress: " + address + "\nGender: " + gender + "\nNewsletter: " + newsletter);
            }
        });
        panel.add(submitButton);

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
