public class RomanNumbers {
    public static void calculate(String input) {
        try {
            String[] strings = input.split("\\W");
            int number1 = toArabic(strings[0]);
            int number2 = toArabic(strings[1]);
            ArabNumeral.formatNumner(number1);
            ArabNumeral.formatNumner(number2);

            String[] operators = input.split("\\w");
            String operator = operators[operators.length - 1];
            int result = ArabNumeral.calculator(number1, number2, operator);
            System.out.println(integerToRoman(result));

        } catch (NumberFormatException e) {
            System.out.println("Use these operators: '+', '-', '*', '/' ");
        } catch (MyException |  IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int toArabic(String value){
        return switch (value){
            case "I" -> EnumRome.I.getValue();
            case "II" -> EnumRome.II.getValue();
            case "III" -> EnumRome.III.getValue();
            case "IV" -> EnumRome.IV.getValue();
            case "V" -> EnumRome.V.getValue();
            case "VI" -> EnumRome.VI.getValue();
            case "VII" -> EnumRome.VII.getValue();
            case "VIII" -> EnumRome.VIII.getValue();
            case "IX" -> EnumRome.IX.getValue();
            case "X" -> EnumRome.X.getValue();
            default -> throw new IllegalStateException("Calculator accepts numbers between I - X: " + value);
        };
    }
    public static String integerToRoman(int number) {
        StringBuilder s = new StringBuilder();
        while (number >= 50) {
            s.append("L");
            number -= 50;
        }
        while (number >= 40) {
            s.append("XL");
            number -= 40;
        }
        while (number >= 10) {
            s.append("X");
            number -= 10;
        }
        while (number >= 9) {
            s.append("IX");
            number -= 9;
        }
        while (number >= 5) {
            s.append("V");
            number -= 5;
        }
        while (number >= 4) {
            s.append("IV");
            number -= 4;
        }
        while (number >= 1) {
            s.append("I");
            number -= 1;
        }
        return s.toString();
    }
}
