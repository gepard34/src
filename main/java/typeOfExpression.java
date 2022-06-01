public class typeOfExpression {
    int firstNumber;
    int secondNumber;
    String operator;
    ExpressionType type;


    public typeOfExpression(int firstNumber, int secondNumber, String operator, ExpressionType type) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.type = type;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof typeOfExpression)) {
            return false;
        }
        typeOfExpression expr = (typeOfExpression) obj;


        return firstNumber == expr.firstNumber &&
                secondNumber == expr.secondNumber &&
                operator.equals(expr.operator) &&
                type.equals(expr.type);
    }
}
