package logic;



public class division extends calculator {


    public division(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    public static void split() {
        try {
            Double result = getA() / getB();
            System.out.print("Частное чисел равно: ");
            System.out.printf("%.4f", result);
        } catch (ArithmeticException e) {
            System.out.print(e+ " На ноль делить нельзя");
        }
    }
}
