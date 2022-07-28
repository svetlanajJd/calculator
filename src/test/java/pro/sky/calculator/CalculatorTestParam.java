package pro.sky.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class CalculatorTestParam {
    private final GreetingsServiceImpl out = new GreetingsServiceImpl();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(10, 2),
                Arguments.of(12, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void correctAnswerPlus(int num1, int num2) {
        int resultExpected = out.answerPlus(num1, num2);
        int resultActual = num1 + num2;
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void correctAnswerMinus(int num1, int num2) {
        int resultExpected = out.answerMinus(num1, num2);
        int resultActual = num1 - num2;
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void correctAnswerMultiply(int num1, int num2) {
        int resultExpected = out.answerMultiply(num1, num2);
        int resultActual = num1 * num2;
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void correctAnswerDivide(int num1, int num2) {
        int resultExpected = out.answerDivide(num1, num2);
        int resultActual = num1 / num2;
        assertEquals(resultExpected, resultActual);
    }
}
