package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel scheet = new JLabel("Введіть номеер закладки: ");
    private JLabel first = new JLabel("Введіть початковий номер поля: ");
    private JLabel last = new JLabel("Введіть кінцевий номер поля: ");

    private JRadioButton radio1 = new JRadioButton("Select this: ");
    private JRadioButton radio2 = new JRadioButton("Select that: ");
    private JCheckBox check = new JCheckBox("Check", false);

    public MyGui() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(scheet);
        container.add(input);
        container.setLayout(new GridLayout(10, 2, 2, 2));
        container.add(first);
        container.add(input);
        container.setLayout(new GridLayout(20, 2, 2, 2));
        container.add(last);
        container.add(input);


        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        radio2.setSelected(true);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was press\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio №1 " : "Radio №2 ") + "is selected!\n";
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}