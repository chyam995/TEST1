package logic;

import java.util.Scanner;

public class division extends calculator{


    public division(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    public static void split ()
    {
        Double result = 0.0;
        if(getB() != 0) {
            result = getA() / getB();
        } else {
            System.out.println("на ноль делить нельзя");
        }
        System.out.print("Частное чисел равно: ");
        System.out.printf("%.4f", result);
    }

}
