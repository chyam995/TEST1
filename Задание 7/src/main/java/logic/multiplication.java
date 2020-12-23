package logic;

import java.util.Scanner;

public class multiplication extends calculator {


    public multiplication(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    public static void multiply()
    {
        double c = getA() * getB();
        System.out.print("Умножение чисел равно: ");
        System.out.printf("%.4f", c);
    }

}
