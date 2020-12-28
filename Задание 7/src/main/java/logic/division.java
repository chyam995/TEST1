package logic;



public class division extends calculator {


    public division(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    public static void split() throws Exception {
            double res = getA() / getB();
                if(Double.isInfinite(res)) throw (new Exception("INFINITE"));
                else {
                    System.out.print("Частное чисел равно: ");
                    System.out.printf("%.4f", res);
                }
    }
}
