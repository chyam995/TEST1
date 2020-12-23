


import logic.calculator;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;



/**
 * @author Ярослав Чернышев appline
 * @version 0.0.1
 */

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AtomicBoolean AppClose = new AtomicBoolean(false);
do {
            System.out.println("введите одно из математических действий [*;/;+;-]");
            String math = scanner.next();
            System.out.println("Введите первое число :");
            //проверка введенных данных
            while (!scanner.hasNextDouble()) {
                System.out.println("Не верный формат введите число в формате : \"0,0\"");
                scanner.next();
            }
            double a = scanner.nextDouble();
            System.out.println("Введите второе дробное число :");
            //проверка введенных данных
            while (!scanner.hasNextDouble()) {
                System.out.println("Не верный формат введите число в формате : \"0,0\"");
                scanner.next();
            }
            double b = scanner.nextDouble();
            calculator C1 = new calculator(math,a,b);
            C1.calculation();
    System.out.println("\nВведите  \"1\" для закрытия или любой символ для продолжения работы программы");

    if (scanner.next().equals("1"))
    {
     AppClose.set(true);
    }
}while (!AppClose.get());

        scanner.close();
    }
}


