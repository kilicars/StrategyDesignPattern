package com.company;

public class Addition implements IOperationStrategy {
    @Override
    public double evaluateOperation(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
}
