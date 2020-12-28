package logic;


public class substaction extends calculator{

    public substaction(String Math, Double a, Double b) {
        super(Math, a, b);
    }
    public static void subtract()
    {
        double c = getA() - getB();
        System.out.print("Разность чисел равна: ");
        System.out.printf("%.4f", c);
    }

}
