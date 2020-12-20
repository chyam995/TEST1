package logic;

import java.util.Scanner;

public class stringArray {

    public static void FindStringArray (Scanner scanner)
    {

        System.out.println("Введите размер массива :");

        int i = scanner.nextInt();
        String[] array = new String [i];

        for (int j=0;j<i;j++)
        {
            System.out.println("Введите слово ");
            array[j] = scanner.next();
        }
        String findword= null;

        for(int k=0;k<array.length;k++){
            for(int j=1+k;j<array.length;j++){
                if(array[k].length()>=array[j].length())
                {
                    findword=array[k];
                }
            }
        }
        if (findword !=null)
        {
            System.out.println("Самое длинное слово в массиве :" + findword);
            System.out.println("Размер максимального слова в массиве равен:" + findword.length());
        }
    }


}
