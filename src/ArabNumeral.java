public class ArabNumeral {
    public static void calculate(String input) {

        try {
            String[] strings = input.split("\\W");
            int number1 = Integer.parseInt(strings[0]);
            int number2 = Integer.parseInt(strings[1]);
            formatNumner(number1);
            formatNumner(number2);

            String[] operators = input.split("\\w");
            String operator = operators[operators.length - 1];
            final int result = calculator(number1, number2, operator);
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Use these operators: '+', '-', '*', '/' ");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int calculator(int number1, int number2, String operator) {
        Calculator calculator = new Calculator();
        int result = switch (operator) {
            case "+" -> calculator.plus(number1, number2);
            case "-" -> calculator.minus(number1, number2);
            case "*" -> calculator.multiply(number1, number2);
            case "/" -> calculator.division(number1, number2);
            default -> throw new NumberFormatException("format is not valid");
        };
        return result;
    }

    public static void formatNumner(int number){
        if(number > 10 || number < 1){
            throw new MyException("sandar 10 menen 1 arasyda");
        }
    }
}
