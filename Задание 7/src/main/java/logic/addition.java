package logic;


/**
 *
 */
public class addition extends calculator {

    public addition(String Math,Double a, Double b) {
        super(Math, a, b);
    }

    /**  метод сложения */
    public static void add()
    {
        double c = getB() + getA();
        System.out.print("Сумма чисел равна: ");
        System.out.printf("%.4f", c);
    }


}
