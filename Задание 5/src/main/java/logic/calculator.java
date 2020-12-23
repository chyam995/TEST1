package logic;


public class calculator {
    private static Double a;
    private static Double b;
    private String Math;


    public calculator(String Math,Double a, Double b) {
        this.Math = Math;
        this.a = a;
        this.b = b;
    }

    public static Double getA() {
        return a;
    }

    public static Double getB() {
        return b;
    }

    public void calculation()
    {
        Double c = 0.0;
        switch (this.Math) {
            case "*":
                multiplication.multiply();
                break;
            case "/":
                division.split();
                break;
            case "+":
                addition.add();
                break;
            case "-":
                substaction.subtract();
                break;
            default:
                System.out.println("введите 1 из математических действий [*;/;+;-]");
                break;
        }
    }

}
