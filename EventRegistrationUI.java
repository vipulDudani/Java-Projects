import java.awt.*;
import java.awt.event.*;

public class EventRegistrationUI {
    private Frame frame;
    private Panel formPanel;
    private Label titleLabel;
    private Label nameLabel;
    private Label emailLabel;
    private Label contactLabel; // Added label for contact number
    private Label yearLabel; // Added label for student year
    private TextField nameTextField;
    private TextField emailTextField;
    private TextField contactTextField; // Added text field for contact number
    private Choice yearChoice; // Added choice for student year
    private Button registerButton;
    private TextArea outputTextArea;

    public EventRegistrationUI() {
        // Create the main frame
        frame = new Frame("Event Registration");
        frame.setBackground(Color.lightGray); // Set background color of the frame
        frame.setLayout(new BorderLayout());

        // Create UI components
        titleLabel = new Label("Event Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Increased font size

        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);

        emailLabel = new Label("Email:");
        emailTextField = new TextField(20);

        contactLabel = new Label("Contact Number:"); // Added label for contact number
        contactTextField = new TextField(20); // Added text field for contact number

        yearLabel = new Label("Year:"); // Added label for student year
        yearChoice = new Choice(); // Added choice for student year
        yearChoice.add("1st Year");
        yearChoice.add("2nd Year");
        yearChoice.add("3rd Year");
        yearChoice.add("4th Year");

        registerButton = new Button("Register");
        registerButton.setBackground(new Color(59, 89, 182)); // Set background color of the button
        registerButton.setForeground(Color.white); // Set text color of the button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration logic here
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String contact = contactTextField.getText(); // Get contact number
                String year = yearChoice.getSelectedItem(); // Get student year from choice
                // Add logic to register the student for the technical fest
                String output = "Registration Successful\nName: " + name + "\nEmail: " + email
                        + "\nContact Number: " + contact + "\nYear: " + year; // Display contact number and year
                outputTextArea.setText(output);
            }
        });

        outputTextArea = new TextArea(10, 30);
        outputTextArea.setEditable(false);

        // Create a panel for the form components and set its properties
        formPanel = new Panel();
        formPanel.setBackground(Color.white); // Set background color of the form panel
        formPanel.setLayout(new GridLayout(6, 2, 10, 10)); // Use GridLayout for form components
        formPanel.add(titleLabel);
        formPanel.add(new Label()); // Add empty label for spacing
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(emailLabel);
        formPanel.add(emailTextField);
        formPanel.add(contactLabel); // Add label for contact number
        formPanel.add(contactTextField); // Add text field for contact number
        formPanel.add(yearLabel); // Add label for student year
        formPanel.add(yearChoice); // Add choice for student year
        formPanel.add(new Label()); // Add empty label for spacing
        formPanel.add(registerButton);

        // Add components
        // Add components to the frame
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(outputTextArea, BorderLayout.SOUTH);

        // Set frame properties
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Add window closing listener
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        EventRegistrationUI eventRegistration = new EventRegistrationUI();
    }
}

