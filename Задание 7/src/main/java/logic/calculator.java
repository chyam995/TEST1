package logic;


import static logic.addition.add;
import static logic.division.split;
import static logic.multiplication.multiply;
import static logic.substaction.subtract;

public class calculator {
    private static Double a;
    private  static Double b;
    private String Math;

    public calculator() {
    }

    public calculator(String Math, Double a, Double b) {
        this.Math = Math;
        this.a = a;
        this.b = b;
    }

    public void setA(Double a) {
        calculator.a = a;
    }

    public void setB(Double b) {
        calculator.b = b;
    }

    public static Double getA() {
        return a;
    }

    public static Double getB() {
        return b;
    }

    public void setMath(String math) {
        this.Math = math;
    }
    public String getMath() {
        return Math;
    }




    public void calculation()
    {
        try {
            switch (getMath()) {
                case "*":
                    multiply();
                    break;
                case "/":

                    split();
                    break;
                case "+":
                    add();
                    break;
                case "-":
                    subtract();
                    break;
                default:
                    System.out.println("введите 1 из математических действий [*;/;+;-]");
                    break;
            }
        }catch (NullPointerException e)
        {
            System.out.print(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }


}
