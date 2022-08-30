public class Calculator implements Operations{
    @Override
    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int minus(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int division(int number1, int number2) {
        return number1 / number2;
    }

    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
