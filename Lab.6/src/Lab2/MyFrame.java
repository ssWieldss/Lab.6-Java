package Lab2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private final JButton parentButton = new JButton("Parent");
    private final JButton studentButton = new JButton("Student");
    private final JButton coolStudentButton = new JButton("CoolStudent");
    private final JButton coolParentButton = new JButton("CoolParent");
    private final JButton admitButton = new JButton("Yes");
    private final JButton exitButton = new JButton("Exit");

    private JTextArea text = new JTextArea("Выберите, кого вы хотите добавить");
    private JLabel label = new JLabel();
    private JTextField textField = new JTextField();

    public JButton getParentButton() {
        return parentButton;
    }
    public JButton getStudentButton() {
        return studentButton;
    }
    public JButton getCoolStudentButton() {
        return coolStudentButton;
    }
    public JButton getCoolParentButton() {return coolParentButton;}
    public JButton getAdmitButton() {
        return admitButton;
    }
    public JButton getExitButton() {return exitButton;}

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }


    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 525);
        this.setLayout(null);



        parentButton.setBounds(0, 0, 200, 100);
        parentButton.setForeground(Color.BLACK);
        parentButton.setFont(new Font("Calibre", Font.BOLD, 25));
        parentButton.setFocusable(false);

        studentButton.setBounds(0, 125, 200, 100);
        studentButton.setForeground(Color.BLACK);
        studentButton.setFont(new Font("Calibre", Font.BOLD, 25));
        studentButton.setFocusable(false);

        coolStudentButton.setBounds(0, 250, 200, 100);
        coolStudentButton.setForeground(Color.BLACK);
        coolStudentButton.setFont(new Font("Calibre", Font.BOLD, 25));
        coolStudentButton.setFocusable(false);

        coolParentButton.setBounds(0, 375, 200, 100);
        coolParentButton.setForeground(Color.BLACK);
        coolParentButton.setFont(new Font("Calibre", Font.BOLD, 25));
        coolParentButton.setFocusable(false);

        exitButton.setBounds(375, 425, 100, 50);
        exitButton.setForeground(Color.BLACK);
        exitButton.setFont(new Font("Calibre", Font.BOLD, 20));
        exitButton.setFocusable(false);

        admitButton.setBounds(380, 350, 70, 30);
        admitButton.setForeground(Color.BLACK);
        admitButton.setFont(new Font("Calibre", Font.BOLD, 10));
        admitButton.setFocusable(false);

        label.setBounds(225, 150, 250, 100);
        label.setFont(new Font("Calibre", Font.BOLD, 10));
        label.setText("Выберите, кого вы хотите создать");

        textField.setBounds(250, 250, 200, 100);
        textField.setBackground(Color.WHITE);

        text.setFont(new Font("Calibre", Font.BOLD, 20));
        text.setBackground(Color.RED);



        this.add(textField);
        this.add(label);
        this.add(parentButton);
        this.add(studentButton);
        this.add(coolStudentButton);
        this.add(coolParentButton);
        this.add(exitButton);
        this.add(admitButton);
        this.setVisible(true);
    }
}
