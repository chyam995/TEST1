package ru.appline;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.io.FileReader;
import java.util.TreeMap;

public class App   {
    public static void main(String[] args) throws IOException {
        BufferedReader Reader =new BufferedReader (new FileReader("file.txt"));
        String string = Reader.readLine();
        int maxCount = 0;
        String maxWord =null;
        String[] words = string.split("\\s+");
        TreeMap<String, Integer> wordToCount = new TreeMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
            if (wordToCount.get(word) > maxCount) {
                maxCount = wordToCount.get(word);
                maxWord = word;
            }
        }
        System.out.println("Список слов и кол-во повторов");
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }

        System.out.println("Cлово с наибольшим кол-вом повторений: \'"+maxWord + "\', колличество повторений: " + maxCount);
    }
}
