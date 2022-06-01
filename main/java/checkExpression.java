import java.util.Arrays;
import java.util.List;

public class checkExpression {
    public static final List<String> operands = Arrays.asList("+", "-", "*", "/");
    public static final List<String> arabic = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    public static final List<String> roman = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

    public static typeOfExpression check(String s){
        String[] spliced = s.split(" ");
        typeOfExpression expression;

        if (!operands.contains(spliced[1])){
            throw new RuntimeException("Неправильный оператор");
        }
        else if (spliced.length != 3) {
            throw new RuntimeException("Неправильное выражение");
        }
        else if (!arabic.contains(spliced[0]) && !roman.contains(spliced[0]) || !arabic.contains(spliced[2]) && !roman.contains(spliced[2])){
            throw new RuntimeException("Неверное число");
        }
        else if (arabic.contains(spliced[0]) && roman.contains(spliced[2]) || arabic.contains(spliced[2]) && roman.contains(spliced[0])){
            throw new RuntimeException("Цифры разного типа");
        }
        else if (arabic.contains(spliced[0])){
            expression = new typeOfExpression(arabic.indexOf(spliced[0])+1, arabic.indexOf(spliced[2])+1, spliced[1], ExpressionType.ARABIC);
        }
        else {
            expression = new typeOfExpression(roman.indexOf(spliced[0])+1, roman.indexOf(spliced[2])+1, spliced[1], ExpressionType.ROMAN);
        }
        return expression;
    }
}
