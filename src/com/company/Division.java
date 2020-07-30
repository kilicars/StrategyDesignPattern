package com.company;

public class Division implements IOperationStrategy {
    static final String ERROR_DIVISION_BY_ZERO = "Can't divide by 0";
    @Override
    public double evaluateOperation(double firstOperand, double secondOperand) {
        checkDivisionByZero(secondOperand);
        return firstOperand / secondOperand;
    }

    private void checkDivisionByZero(double divisor) {
        if (divisor == 0){
            throw new IllegalArgumentException(ERROR_DIVISION_BY_ZERO);
        }
    }
}
