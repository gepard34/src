import java.util.Scanner;

public class Calc {

    public static String Calc (String s) {

        typeOfExpression expression = checkExpression.check(s);


        int result;
        result = switch (expression.operator) {
            case "+" ->
                result = expression.firstNumber + expression.secondNumber;

            case "-" ->
                result = expression.firstNumber - expression.secondNumber;

            case "*" ->
                result = expression.firstNumber * expression.secondNumber;

            case "/" ->
                result = (int) (expression.firstNumber / expression.secondNumber);
            default -> 0;
        };
        if (expression.type == ExpressionType.ARABIC){
            return Integer.toString(result);

    } else if (result <=0){
            throw new RuntimeException("Результат меньше или равен нулю");
        }
        else {
            return Convert.toRoman(result);
        }

    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String s1 = scr.nextLine();
        typeOfExpression expr = checkExpression.check(s1);
        System.out.println("Результат:" + Calc(s1));


    }
}
