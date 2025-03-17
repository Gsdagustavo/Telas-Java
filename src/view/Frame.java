package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        setVisible(true);
        setEnabled(true);
        setSize(800, 600);

        add(iconLabel());
        add(textLabel());
    }

    private JLabel textLabel() {
        JLabel label = new JLabel("Label com texto");
        label.setEnabled(true);
        label.setToolTipText("Este é o label 1");

        return label;
    }

    private JLabel iconLabel() {
        Icon icon = new ImageIcon("C:\\Users\\Aluno\\Downloads\\tomates.png");
        JLabel label = new JLabel("Label com icone", icon, SwingConstants.LEFT);
        label.setToolTipText("Icone");
        label.setSize(100, 100);

        return label;
    }
}
