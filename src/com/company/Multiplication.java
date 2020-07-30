package com.company;

public class Multiplication implements IOperationStrategy {
    @Override
    public double evaluateOperation(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
