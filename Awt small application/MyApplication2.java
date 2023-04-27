import java.awt.*;
import java.awt.event.*;

public class MyApplication2 extends Frame {

    public MyApplication() {
        Button button = new Button("Click me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
        add(button);
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApplication();
    }

}
