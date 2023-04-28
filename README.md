This code is a Java program that creates a simple user interface (UI) for event registration using AWT (Abstract Window Toolkit) components. The UI consists of a window with a form for users to enter their name, email, contact number, and student year, and a register button to submit the form.

Here is a brief overview of the code:

The UI components are declared as private instance variables, including a Frame for the main window, Labels for displaying text, TextFields for input, a Choice for selecting options, a Button for submitting the form, and a TextArea for displaying output.

The constructor of the class, EventRegistrationUI(), initializes the UI components and sets their properties, such as font size, background color, and event listeners. It also creates a panel to hold the form components using a GridLayout.


![dadaas](https://user-images.githubusercontent.com/128981674/231796702-eb656455-5b95-4180-ac63-356528f36d33.PNG)



The main() method creates an instance of the EventRegistrationUI class, which in turn creates the UI window and displays it.

The windowClosing event of the Frame is handled by adding a WindowAdapter with an anonymous inner class that defines the windowClosing() method. This method simply calls System.exit(0) to terminate the program when the window is closed.


![dadads](https://user-images.githubusercontent.com/128981674/231796733-3186eb2c-329a-4e4a-8693-76042cf2f1e8.PNG)




Overall, this code creates a simple UI for event registration with input fields for name, email, contact number, and student year, and a register button to submit the form and display the registration details in a TextArea.



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


 
AWT CALCULATOR


![add](https://user-images.githubusercontent.com/128981674/232272077-fdac2d9d-c8f3-4f73-94a4-0f7ab830322d.PNG)



he simple calculator created using AWT (Abstract Windowing Toolkit) in Java is a standalone application that provides a graphical user interface (GUI) for performing basic arithmetic operations such as addition, subtraction, multiplication, and division. 



![sub](https://user-images.githubusercontent.com/128981674/232272081-06fb1355-8c86-4b0d-8eca-a96003ea45eb.PNG)



he simple calculator created using AWT (Abstract Windowing Toolkit) in Java is a standalone application that provides a graphical user interface (GUI) for performing basic arithmetic operations such as addition, subtraction, multiplication, and division. 


![mul](https://user-images.githubusercontent.com/128981674/232272082-b995e657-c221-485a-873f-61f3103607fb.PNG)



Overall, the simple calculator created using AWT in Java provides a basic example of how to create a graphical calculator application using Java's AWT library, which allows for user-friendly input and output for performing arithmetic operations.


![div](https://user-images.githubusercontent.com/128981674/232272093-c7df28bd-81ec-4c0e-a3e3-28ab0b8ca4df.PNG)




The ActionListener for the registerButton is implemented using an anonymous inner class, which defines the actionPerformed() method that is called when the registerButton is clicked. Inside this method, the values entered by the user in the TextFields and Choice are retrieved, and a registration output string is created and displayed in the TextArea.
