package logic;

import java.util.Scanner;

public class substaction extends calculator{


    public substaction(String Math, Double a, Double b) {
        super(Math, a, b);
    }
    public static void subtract ()
    {
        System.out.println("Введите первое дробное число :");

        double c = getA() - getB();
        System.out.print("Разность чисел равна: ");
        System.out.printf("%.4f", c);
    }

}
