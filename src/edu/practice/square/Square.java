package edu.practice.square;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Square implements ActionListener {
    frame parent;
    char selectedAction = ' ';
    boolean res = true;
    double currentResult1 =0;
    double currentResult2 =0;
    Square(frame parent){
        this.parent = parent;
    }
    public void actionPerformed(ActionEvent e){
        JButton clickedButton = (JButton) e.getSource();
        String field1Text=parent.field1.getText();
        String field2Text=parent.field2.getText();
        String field3Text=parent.field3.getText();
        double a=0;
        double b=0;
        double c=0;
        if (!"".equals(field1Text)){
            a= Double.parseDouble(field1Text);
        }
        if (!"".equals(field2Text)){
            b= Double.parseDouble(field2Text);
        }
        if (!"".equals(field3Text)){
            c= Double.parseDouble(field3Text);
        }
        Object src = e.getSource();
        if (src == parent.go) {
            selectedAction = '=';
            double D = b * b - (4 * a * c);
            if (D < 0) {
                String otrResult = "Корней нет";
                res = false;
            } else {
                double x1 = (Math.sqrt(D) - b) / (2 * a);
                double x2 = (-Math.sqrt(D) - b) / (2 * a);
                if (x1 == x2) {
                    currentResult2 = x1;
                    parent.result.setText(" " + currentResult2);
                }
                else {currentResult1 = x1;
                    currentResult2 = x2;
                    parent.result.setText(currentResult1 + "," + currentResult2);
                }
            }
        }

    }
}
