package logic;

import java.util.HashSet;
import java.util.Scanner;

public class stringArray {

    public static void FindStringArray (Scanner scanner) {

        System.out.println("Введите размер массива :");

        int i = scanner.nextInt();
        String[] array = new String[i];
        String findword = "";
        HashSet<String> maxwords = new HashSet<String>();
        for (int j = 0; j < i; j++) {
            System.out.println("Введите слово ");
            array[j] = scanner.next();
            if (array[j].length() >= findword.length()) findword = array[j];
        }
        for (int j = 0; j < i; j++)
        {
            if(array[j].length()==findword.length())
            {
                maxwords.add(array[j]);
            }

        }
        if(maxwords.size()>1)
        {
            System.out.println("Самые длинные слова в массиве :");
            for(String Maxword:maxwords )
            {
                System.out.println(Maxword);
            }
        }
        else {
            for(String Maxword:maxwords )
            {
                System.out.println("Самое длинное слово в массиве :" + Maxword);
            }
        }
        System.out.println("Размер максимального слова в массиве равен:" + findword.length());
    }
}



