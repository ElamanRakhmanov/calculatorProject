import java.util.Scanner;

/**
 * Elaman Rakhmanov
 */

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        char c = input.charAt(0);
        if (Character.isLetter(c)){
            RomanNumbers.calculate(input);
        } else{
            ArabNumeral.calculate(input);
        }
    }
}
