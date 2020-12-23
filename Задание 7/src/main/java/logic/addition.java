package logic;

import java.util.Scanner;

public class addition extends calculator {


    public addition(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    //метод сложения
    public static void add()
    {

        Double c = getA() + getB();
        System.out.print("Сумма чисел равна: ");
        System.out.printf("%.4f", c);
    }


}
