package edu.practice.square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:\n 1 - запуск программы, \n 2 - запуск окна \n Enter - выход ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        frame fr = new frame();
        Text text= new Text();
        while (!str.isEmpty()) {
            try {
                int number = Integer.parseInt(str);
                if (number == 1 || number == 2) {
                    if (number == 1) {
                        if (fr.isVisible()) {
                            fr.setVisible(false);
                            fr.dispose();
                        }
                        text.setVisible(true);
                    } else {
                        if (text.isVisible()) {
                            text.setVisible(false);
                            text.dispose();
                        }
                        fr.setVisible(true);
                    }
                } else {
                    if (fr.isVisible()) {
                        fr.setVisible(false);
                        fr.dispose();
                    }
                    if (text.isVisible()) {
                        text.setVisible(false);
                        text.dispose();
                    }
                    System.out.println("Введите цифру 1 или 2");
                }
            } catch (NumberFormatException exp) {
                if (fr.isVisible()) {
                    fr.setVisible(false);
                    fr.dispose();
                }
                if (text.isVisible()) {
                    text.setVisible(false);
                    text.dispose();
                }
                System.out.println("Введите цифру 1 или 2");
            }
            str = scan.nextLine();
        }
        System.out.println("Завершение работы");
        if (fr.isVisible()) {
            fr.setVisible(false);
            fr.dispose();
        }
        if (text.isVisible()) {
            text.setVisible(false);
            text.dispose();
        }
    }
}

