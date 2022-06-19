package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class GreetingsServiceImpl implements GreetingsService {


    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerPlus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + sum;
    }

    public String answerMinus(int num1, int num2) {
        int dif = num1 - num2;
        return num1 + "-" + num2 + "=" + dif;
    }

    public String answerMultiply(int num1, int num2) {
        int prod = num1 * num2;
        return num1 + "*" + num2 + "=" + prod;
    }

        public String answerDivide(int num1, int num2) {
        if (num2 != 0) {
            int del = num1 / num2;
            return num1 + "/" + num2 + "=" + del;
        }
        String er = "Ошибка! делить на 0 нельзя";
        return er;
    }
}
