package com.company;

public class OperationContext {
    IOperationStrategy arithmeticOperation;
    public OperationContext(IOperationStrategy arithmeticOperation){
        this.arithmeticOperation = arithmeticOperation;
    }
    public double executeOperation(double firstOperand, double secondOperand){
        return arithmeticOperation.evaluateOperation(firstOperand, secondOperand);
    }
}
