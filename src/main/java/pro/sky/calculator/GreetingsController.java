package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    private GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping
    public String greetings() {
        return greetingsService.greetings();
    }

    @GetMapping(path = "/plus")
    public String answerPlus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return greetingsService.answerPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String answerMinus(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return greetingsService.answerMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String answerMultiply(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return greetingsService.answerMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String answerDivide(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return greetingsService.answerDivide(num1, num2);
    }
}
