package logic;



public class division extends calculator {


    public division(String Math, Double a, Double b) {
        super(Math, a, b);
    }

    public static void split() throws Exception {
            double result = getA() / getB();
                if(Double.isNaN(result)){
            throw(new Exception("NAN"));
                     }
            else if(Double.isInfinite(result)){
            throw(new Exception("INFINITE"));
            }
            else {
                    System.out.print("Частное чисел равно: ");
                    System.out.printf("%.4f", result);
                }
    }
}
