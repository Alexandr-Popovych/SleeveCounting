package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JTextField input3 = new JTextField("", 5);

    private JLabel scheet = new JLabel("Введіть номеер закладки: ");
    private JLabel first = new JLabel("Введіть початковий номер поля: ");
    private JLabel last = new JLabel("Введіть кінцевий номер поля: ");


    public MyGui() {
        super("Simple Example");
        this.setBounds(100, 100, 450, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 4, 2, 2));
        container.add(scheet);
        container.add(input1);
        container.add(first);
        container.add(input2);
        container.add(last);
        container.add(input3);

        ButtonGroup group = new ButtonGroup();

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was press\n";
            message += "Text is " + input1.getText() + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}