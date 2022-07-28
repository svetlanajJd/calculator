package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    private final GreetingsServiceImpl out = new GreetingsServiceImpl();

    private int num1;
    private int num2;
    private int num3;
    private int num4;

    @BeforeEach
    public void setUp() {
        num1 = 10;
        num2 = 12;
        num3 = 12;
        num4 = 2;
    }

    @Test
    public void getPlus() {
        int expected1 = out.answerPlus(num1, num2);
        int actual1 = num1 + num2;
        int expected2 = out.answerPlus(num3, num4);
        int actual2 = num3 + num4;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void getMinus() {
        int expected1 = out.answerMinus(num1, num2);
        int actual1 = num1 - num2;
        int expected2 = out.answerMinus(num3, num4);
        int actual2 = num3 - num4;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void getMultiply() {
        int expected1 = out.answerMultiply(num1, num2);
        int actual1 = num1 * num2;
        int expected2 = out.answerMultiply(num3, num4);
        int actual2 = num3 * num4;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void getDivide() {
        int expected1 = out.answerDivide(num1, num2);
        int actual1 = num1 / num2;
        int expected2 = out.answerDivide(num3, num4);
        int actual2 = num3 / num4;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void DivideArgumentNotZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.answerDivide(num1, num2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.answerDivide(num3, num4));
    }
}
