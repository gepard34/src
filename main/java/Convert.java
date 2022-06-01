public class Convert {
    public static String toRoman(int number){
        int i = 0;
        Rimskie [] romanNumbers = Rimskie.values();
        StringBuilder sb = new StringBuilder();
        while ((number>0) && (i<romanNumbers.length)){
            Rimskie currentNummber = romanNumbers[i];
            if (currentNummber.getValue() <= number){
                sb.append(currentNummber.name());
                number -= currentNummber.getValue();
            }
            else {
                i++;
            }
        }
        return sb.toString();
    }
}
