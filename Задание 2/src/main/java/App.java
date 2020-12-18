

import java.util.Scanner;

/**
 * @author Ярослав Чернышев appline
 * @version 0.0.1
 */
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое дробное число :");
        //проверка введенных данных
        while (!scanner.hasNextDouble()) {
            System.out.println("Не верный формат введите число в формате : \"0,0\"");
            scanner.next();
        }
        Double a = scanner.nextDouble();

        System.out.println("Введите второе дробное число :");
        //проверка введенных данных
        while (!scanner.hasNextDouble()) {
            System.out.println("Не верный формат введите число в формате : \"0,0\"");
            scanner.next();
        }
        double b = scanner.nextDouble();

        double c = a + b;
        System.out.print("cумма чисел равна: ");
        System.out.printf("%.4f", c);

        scanner.close();

    }
}
