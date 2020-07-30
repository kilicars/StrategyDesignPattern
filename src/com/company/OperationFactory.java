package com.company;

public class OperationFactory {
    static final String UNEXPECTED_ARITHMETIC_OPERATOR = "Found unexpected value for arithmetic operator: ";
    public IOperationStrategy getArithmeticOperation(Operator operator){
        switch (operator){
            case ADDITION:
                return new Addition();
            case SUBTRACTION:
                return new Subtraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            default:
                throw new IllegalArgumentException(UNEXPECTED_ARITHMETIC_OPERATOR + operator);
        }
    }
}
