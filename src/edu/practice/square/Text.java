package edu.practice.square;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text  extends JFrame {
    private JButton button = new JButton("Нажми");
    private JTextField input = new JTextField("", 10);
    private JLabel label = new JLabel("Введите текст");

    public Text() {
        super("Окно для ввода текста");
        this.setBounds(100, 100, 250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //по центру экрана

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        button.addActionListener(new ButtonEvent());
        container.add(button);
    }

    class ButtonEvent implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message="";
            message+="Вы ввели текст:\n" +input.getText()+"\n";
            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
            setLocationRelativeTo(null);
        }
    }


}


