package de.trion.calculatorbackend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {
    
    private final CalculatorService calculatorService;
    
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    
    @PostMapping("/calculate")
    public String calculate(@RequestBody CalculationRequest request) {
        System.out.println("Request received by CalculatorController, sending to CalculatorService...");
        return calculatorService.calculate(request);
    }
}