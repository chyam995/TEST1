


import java.util.Scanner;
import logic.*;
/**
 * @author Ярослав Чернышев appline
 * @version 0.0.1
 */

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean AppClose = false;
do {
    System.out.println("Введите  \"1\"(запуститься выполнение калькулятора) или \"2\"(поиск максимального слова в массиве)");

    String NumberApp = scanner.next();
/**
 * Вызов кальлятора или поиска максимального слова
 */
    switch (NumberApp) {
        case "1":
            calculator.calculation(scanner);
            break;
        case "2":
            stringArray.FindStringArray(scanner);
            break;
    }

    System.out.println("Введите  \"1\" для закрытия или любой символ для продолжения работы программы");

    if (scanner.next().equals("1"))
    {
     AppClose = true;
    }
}while (!AppClose);

        scanner.close();

    }
}


