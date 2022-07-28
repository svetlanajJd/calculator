package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {


    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public int answerPlus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
        //изменено возвращаемое значение (return num1 + "+" + num2 + "=" + sum);
    }

    public int answerMinus(int num1, int num2) {
        int dif = num1 - num2;
        return dif;
        //изменено возвращаемое значение (return num1 + "-" + num2 + "=" + dif);
    }

    public int answerMultiply(int num1, int num2) {
        int prod = num1 * num2;
        return prod;
        //изменено возвращаемое значение  (return num1 + "*" + num2 + "=" + prod);
    }

    public int answerDivide(int num1, int num2) {
        if (num2 != 0) {
            int del = num1 / num2;
            return del;
            //изменено возвращаемое значение (num1 + "/" + num2 + "=" + del);
        }
        throw new IllegalArgumentException("argument are null");
    }
}
