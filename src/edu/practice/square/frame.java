package edu.practice.square;

import javax.swing.*;
import java.awt.FlowLayout;

public class frame extends JFrame {
    JPanel windowContent= new JPanel();
    FlowLayout fl = new FlowLayout();
    JLabel label1 = new JLabel("Коэф 1");
    JTextField field1 = new JTextField(10);
    JLabel label2 = new JLabel("Коэф 2");
    JTextField field2 = new JTextField(10);
    JLabel label3 = new JLabel("Коэф 3");
    JTextField field3 = new JTextField(10);
    JButton go = new JButton("Решение");
    JLabel label4 = new JLabel("Ответ");
    JTextField result = new JTextField(10);
    frame(){
        windowContent.setLayout(fl);
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(field3);
        windowContent.add(go);
        windowContent.add(label4);
        windowContent.add(result);
        JFrame myWindow = new JFrame("Корни квадратного уравнения");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(500, 100);
        myWindow.setVisible(true);
        myWindow.setContentPane(windowContent);
        Square squ= new Square(this);
        go.addActionListener(squ);
    }


}


