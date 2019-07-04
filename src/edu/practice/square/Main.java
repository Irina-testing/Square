package edu.practice.square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициент а: ");
        double a= in.nextDouble();
        System.out.println("Введите коэффициент b: ");
        double b= in.nextDouble();
        System.out.println("Введите коэффициент c: ");
        double c= in.nextDouble();
        double D = b*b-(4*a*c);
        if (D<0) {System.out.println("уравнение не имеет корней");}
        else {
            double x1 = (Math.sqrt(D) - b) / (2 * a);
            double x2 = (-Math.sqrt(D) - b) / (2 * a);
            if (x1 == x2) {
                System.out.println(x1);
            } else {
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
}

