package logic;

import java.util.Scanner;

public class stringArray {

    public static void FindStringArray (Scanner scanner) {

        System.out.println("Введите размер массива :");

        int i = scanner.nextInt();
        String[] array = new String[i];
        String findword = "";
        for (int j = 0; j < i; j++) {
            System.out.println("Введите слово ");
            array[j] = scanner.next();
            if (array[j].length() >= findword.length()) findword = array[j];
        }

        System.out.println("Самое длинное слово в массиве :" + findword);
        System.out.println("Размер максимального слова в массиве равен:" + findword.length());
    }
}



