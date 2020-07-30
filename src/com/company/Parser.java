package com.company;

public final class Parser {

    static final int MIN_TOKENS_LENGTH = 3;
    static final String ARITHMETIC_OPERATORS = "+, -, /, *";
    static final String ERROR_CONVERT_CHAR_TO_DIGIT = "Can't convert character to digit: ";
    static final String ERROR_CONVERT_CHAR_TO_OPERATOR = "Can't convert character to operator: " + ARITHMETIC_OPERATORS;
    static final String ERROR_WRONG_NUMBER_OF_TOKENS = "Must have " + MIN_TOKENS_LENGTH + " tokens separated by spaces";

    public static OperationElements parseExpression(String expression){
        String[] tokens = extractTokens(expression);
        Operator operator = convertCharToOperator(tokens[1].charAt(0));
        double firstOperand = convertToNumber(tokens[0]);
        double secondOperand = convertToNumber(tokens[2]);
        return new OperationElements(firstOperand,secondOperand,operator);
    }

    private static Operator convertCharToOperator(char operator){
        switch (operator){
            case '+':
                return Operator.ADDITION;
            case '-':
                return Operator.SUBTRACTION;
            case '*':
                return Operator.MULTIPLICATION;
            case '/':
                return Operator.DIVISION;
            default:
                throw new NumberFormatException(ERROR_CONVERT_CHAR_TO_OPERATOR);
        }
    }

    private static int convertCharToDigit(char character){
        if (character < '0' || character > '9') {
            throw new NumberFormatException(ERROR_CONVERT_CHAR_TO_DIGIT + character);
        }
        int digit = character - '0';
        return digit;
    }

    private static double convertToNumber(String operand){
        double result = 0;
        for (int i = 0; i < operand.length(); i++) {
            char character = operand.charAt(i);
            int digit = convertCharToDigit(character);
            result = result * 10 + digit;
        }
        return result;
    }

    private static void checkTokens(String[] tokens){
        if (tokens.length != MIN_TOKENS_LENGTH) {
            throw new IllegalArgumentException(ERROR_WRONG_NUMBER_OF_TOKENS);
        }
    }

    private static String[] extractTokens(String expression){
        String[] tokens = expression.split(" ");
        checkTokens(tokens);
        return tokens;
    }
}
