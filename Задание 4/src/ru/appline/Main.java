package ru.appline;

import ru.appline.model.Candy;
import ru.appline.model.Jellybean;
import ru.appline.model.NewYearGift;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите  \"1\"(запуститься работа с массивом) или \"2\"(сбор новогоднего подарка)");

        String NumberApp = scanner.next();
        switch(NumberApp)
    {
        case "1":
            getArray();
            break;
        case "2":
            getNewYearGift();
            break;
        default:
            System.out.println("Hello");

    }

    }

    public static void getArray() {
        int[] Array = new int[20];
        Random random = new Random();
        int max = 10;
        int min = -10;
        int minNumber = 11;
        int maxNumber = -11;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = random.nextInt(max - min) + min;
            if (maxNumber <= Array[i]) {
                maxNumber = Array[i];
                maxIndex = i;
            }
            if (minNumber >= Array[i]) {
                minNumber = Array[i];
                minIndex = i;
            }
        }
        System.out.print("Исходный массив:");
        for (int Value : Array) {
            System.out.print(Value + ";");
        }

        System.out.println("\nмаксимальный элемент:" + maxNumber + " ,индекс элемента: " + maxIndex);
        System.out.println("минимальный элемент:" + minNumber + " ,индекс элемента: " + minIndex);

        Array[minIndex] = maxNumber;
        Array[maxIndex] = minNumber;


        System.out.print("Полученный массив:");
        for (int Value : Array) {
            System.out.print(Value + ";");
        }
    }

    public static void getNewYearGift() {

        Candy Candy1 = new Candy("Алёнка",10.5,10,"шоколадная");
        Candy Candy2 = new Candy("Карамелька",10.5,10,"карамельная");
        Jellybean Jellybean1 = new Jellybean("Frutella",20.5,40,"Саратов");
        Jellybean Jellybean2 = new Jellybean("Skittles",35.0,50,"Москва");
        Double sumPrice = 0.0;
        int AllWeight = 0;
        NewYearGift [] NewYearGift = {Candy1,Candy2,Jellybean1,Jellybean2};
        for ( NewYearGift someNewYearGift :NewYearGift)
        {
                sumPrice = sumPrice+ someNewYearGift.getPrice();
                AllWeight = AllWeight + someNewYearGift.getWeight();
                System.out.println(someNewYearGift.toString());
        }
                System.out.println("Общая сумма подарка в руб.:"+sumPrice);
                System.out.println("Общий вес подарка в гр.:"+AllWeight);

    }
}