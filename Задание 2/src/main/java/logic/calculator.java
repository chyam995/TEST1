package logic;

import java.util.Scanner;

public class calculator {

    public static void calculation(Scanner scanner)
    {
        System.out.println("введите одно из математических действий [*;/;+;-]");
        String math = scanner.next();
        switch (math) {
            case "*":
                multiplication(scanner);
                break;
            case "/":
                division(scanner);
                break;
            case "+":
                addition(scanner);
                break;
            case "-":
                substaction(scanner);
                break;
            default:
                System.out.println("введите 1 из математических действий [*;/;+;-]");
                break;
        }
    }

    //функия сложения
    public static void addition(Scanner scanner)
    {
        System.out.println("Введите первое дробное число :");
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

        double c = a + b;
        System.out.print("Сумма чисел равна: ");
        System.out.printf("%.4f", c);
    }
    //функия вычитания
    public static void substaction (Scanner scanner )
    {
        System.out.println("Введите первое дробное число :");
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

        double c = a - b;
        System.out.print("Разность чисел равна: ");
        System.out.printf("%.4f", c);
    }

    //функция деления
    public static void division (Scanner scanner )
    {
        System.out.println("Введите первое дробное число :");
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
        if (b != 0) {
            double result = a / b;
            System.out.print("Частное чисел равно: ");
            System.out.printf("%.4f", result);
        } else {
            System.out.println("на ноль делить нельзя");
        }
    }

    //функция умножения
    public static void multiplication(Scanner scanner)
    {
        System.out.println("Введите первое дробное число :");
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

        double c = a * b;
        System.out.print("Произведение чисел равно: ");
        System.out.printf("%.4f", c);
    }

}
