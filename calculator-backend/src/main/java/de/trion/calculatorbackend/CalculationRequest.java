package de.trion.calculatorbackend;

/**
 * Contains the request data for the calculator.
 */
public class CalculationRequest {
    private double a;
    private double b;
    private String operator;
    
    // Constructor
    public CalculationRequest(String operator, double a, double b) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }
    
    // Getters and setters
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public String getOperator() {
        return operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
