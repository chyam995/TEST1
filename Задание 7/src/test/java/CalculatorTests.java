
import logic.calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Ярослав Чернышев
 */
public class CalculatorTests {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void сheckingTheFirstNumber() {
        calculator c1 = new calculator("*", 5.0, 10.0);
        Assert.assertEquals("Первое число должно быть равно переданному в объект", 5.0, c1.getA(), 0);
    }

    @Test
    public void сheckingTheSecondNumber() {
        calculator c1 = new calculator("*", 5.0, 10.0);
        Assert.assertEquals("Второе число должно быть равно переданному в объект", 10.0, c1.getB(), 0);
    }

    @Test
    public void checkingTheMultiplicationFunction() {
        calculator c1 = new calculator("*", 5.0, 10.0);
        c1.calculation();
        Assert.assertEquals("Умножение чисел равно: 50,0000", output.toString());
    }
    @Test
    public void checkingTheAdditionFunction() {
        calculator c1 = new calculator("+", 5.0, 10.0);
        c1.calculation();
        Assert.assertEquals("Сумма чисел равна: 15,0000", output.toString());
    }
    @Test
    public void checkingTheSubstactionFunction() {
        calculator c1 = new calculator("-", 5.0, 10.0);
        c1.calculation();
        Assert.assertEquals("Разность чисел равна: -5,0000", output.toString());
    }
    @Test
    public void checkingTheDivisionFunction() {
        calculator c1 = new calculator("/", 5.0, 10.0);
        c1.calculation();
        Assert.assertEquals("Частное чисел равно: 0,5000", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}

