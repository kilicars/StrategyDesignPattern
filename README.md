# StrategyDesignPattern
Evaluate math expression using Strategy design pattern

Expression is a string formatted as: "[someNumber] [operator] [someNumber]"

    -------------------------------The classes and their explanations--------------------------------------------
    Operator          : Enumeration for all operations
    OperationElements : Class that includes the elements of the operation i.e operands and the operator    
    Parser            : Static class that parses the given expression and returns the related operation elements
    IOperationStrategy: Strategy interface for operations
    Addition          : Concrete Strategy class for addition operation (implements IOperationStrategy)
    Subtraction       : Concrete Strategy class for subtraction operation (implements IOperationStrategy)
    Multiplication    : Concrete Strategy class for multiplication operation (implements IOperationStrategy)
    Division          : Concrete Strategy class for division operation (implements IOperationStrategy)
    OperationContext  : Context for operation. Includes a field in the type of IOperationStrategy
    OperationFactory  : Factory to return the related operation strategy class for the given operator
    -------------------------------------------------------------------------------------------------------------
