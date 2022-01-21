package Lab2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Creating implements ActionListener {

        private MyFrame frame;

        public Creating(MyFrame frame){
        this.frame = frame;
        frame.getParentButton().addActionListener(this);
        frame.getStudentButton().addActionListener(this);
        frame.getCoolStudentButton().addActionListener(this);
        frame.getCoolParentButton().addActionListener(this);
        frame.getExitButton().addActionListener(this);
    }

        @Override
        public void actionPerformed(ActionEvent e) {


            if (e.getSource()==frame.getParentButton()){

                frame.setText("Введите имя, возраст, пол ");

                frame.getAdmitButton().addActionListener(e1 -> {
                    String[] text = frame.getTextField().getText().split(" ");
                    String name = null;
                    int age = 0;
                    String sex = null;
                    try {
                        name = text[0];
                        age = Integer.parseInt(text[1]);
                        sex = text[2];
                        Parent parent = new Parent(name, age, sex);
                        frame.setText("Родитель был успешно создан!");
                        System.out.println(parent.toString());
                    }catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Введите верные данные!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    finally {
                        frame.getAdmitButton().removeActionListener(frame.getAdmitButton().getActionListeners()[0]);
                    }
                });

            }

            if (e.getSource()==frame.getStudentButton()){

                frame.setText("Введите имя, возраст, пол, отчество и среднюю оценку ");
                frame.getAdmitButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = frame.getTextField().getText().split(" ");
                        String name = null;
                        int age = 0;
                        String sex = null;
                        String patronymic;
                        double mark = 0;
                        try {
                            name = text[0];
                            age = Integer.parseInt(text[1]);
                            sex = text[2];
                            patronymic = text[3];
                            mark = Double.parseDouble(text[4]);
                            Student student = new Student(name, age, sex, patronymic, mark);
                            frame.setText("Студент был успешно создан!");
                            System.out.println(student.toString());
                        }catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Введите верные данные!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        frame.getAdmitButton().removeActionListener(frame.getAdmitButton().getActionListeners()[0]);
                    }
                });

            }

            if(e.getSource()==frame.getCoolStudentButton()){
                frame.setText("Введите имя, возраст, пол, отчество и среднюю оценку");
                frame.getAdmitButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ev) {
                        String[] text = frame.getTextField().getText().split(" ");
                        String name = null;
                        int age = 0;
                        String sex = null;
                        String patronymic;
                        double mark = 0;
                        try {
                            name = text[0];
                            age = Integer.parseInt(text[1]);
                            sex = text[2];
                            patronymic = text[3];
                            mark = Double.parseDouble(text[4]);
                            CoolStudent coolstudent = new CoolStudent(name, age, sex, patronymic, mark);
                            frame.setText("Крутой студент был успешно создан!");
                            System.out.println(coolstudent.toString());
                        }catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Введите верные данные!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        frame.getAdmitButton().removeActionListener(frame.getAdmitButton().getActionListeners()[0]);
                    }
                });
            }

            if (e.getSource()==frame.getCoolParentButton()){

                frame.setText("Введите имя, возраст, пол, карманные деньги ");
                frame.getAdmitButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String[] text = frame.getTextField().getText().split(" ");
                        String name = null;
                        int age = 0;
                        String sex = null;
                        double pocketmoney = 0;
                        try {
                            name = text[0];
                            age = Integer.parseInt(text[1]);
                            sex = text[2];
                            pocketmoney = Double.parseDouble(text[3]);
                            CoolParent coolparent = new CoolParent(name, age, sex, pocketmoney);
                            frame.setText("Крутой Родитель был успешно создан!");
                            System.out.println(coolparent.toString());
                        }catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Введите верные данные!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        frame.getAdmitButton().removeActionListener(frame.getAdmitButton().getActionListeners()[0]);
                    }
                });
            }
            if (e.getSource()==frame.getExitButton()){
                System.exit(0);
            }
        }
        }
