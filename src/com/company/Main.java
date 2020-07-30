package com.company;

import java.util.Scanner;

public class Main {

    private static double evaluateMathExpression(String expression) {
        OperationElements operationElements = Parser.parseExpression(expression);
        OperationFactory operationFactory = new OperationFactory();
        IOperationStrategy operationStrategy = operationFactory.getArithmeticOperation(operationElements.operator);
        OperationContext operationContext = new OperationContext(operationStrategy);
        return operationContext.executeOperation(operationElements.firstOperand, operationElements.secondOperand);
    }

    private static void processExpression(String expression) {
        String output;
        try {
            double result = evaluateMathExpression(expression);
            output = String.valueOf(result);
        } catch (NumberFormatException e) {
            output = "NumberFormatException " + e.getMessage();
        } catch (IllegalArgumentException e) {
            output = "IllegalArgumentException " + e.getMessage();
        }
        System.out.print(output);
    }

    private static String getExpressionFromConsole() {
        Scanner inputScanner = new Scanner(System.in);
        String expression = inputScanner.nextLine();
        inputScanner.close();
        return expression;
    }

    public static void main(String[] args) {
        String expression = getExpressionFromConsole();
        processExpression(expression);
    }

}
