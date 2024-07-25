package de.trion.calculatorbackend;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /**
     * Process the incoming request and calculate the result.
     */
    public String calculate(CalculationRequest request) {
        System.out.println("Request received by CalculatorService: " + request.getA() + " " + request.getOperator() + " " + request.getB());
        double a = request.getA();
        double b = request.getB();
        String operator = request.getOperator();
        double result = 0;
        if (operator.equals("/") && b == 0) {
            System.out.println("Division by zero is not allowed.");
            return "Division by zero is not allowed.";
        } else {
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
        }}
        System.out.println("Result: " + result);
        return String.valueOf(result);
    }

}
