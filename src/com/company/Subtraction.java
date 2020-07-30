package com.company;

public class Subtraction implements IOperationStrategy {
    @Override
    public double evaluateOperation(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }
}
