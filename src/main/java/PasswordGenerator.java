import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PasswordGenerator {

    private static final int LOW_BOUND = 8;
    private static final int HIGH_BOUND = 20;
    private static final String SYMBOL = "!@#$%^&*";
    private static final String NUMBER = "0123456789";
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int passwordLength;
        while (true) {
            System.out.println("Введите длину пароля: ");
            String line = reader.readLine();
            passwordLength = Integer.parseInt(line);
            if (passwordLength >= LOW_BOUND && passwordLength <= HIGH_BOUND) {
                break;

            } else if (passwordLength < LOW_BOUND) {
                System.out.println("Слишком маленький пароль");
                System.out.println();
                continue;

            } else if (passwordLength > HIGH_BOUND) {
                System.out.println("Слишком длинный пароль");
                System.out.println();
                continue;
            }
        }

        String[] array = {LETTERS, NUMBER, SYMBOL};
        int bound = 3;
        int countOfNumbers = 0;
        Random random = new Random();
        String password = "";
        String previousSymbol = "";
        while (password.length() != passwordLength) {
            int setOfSymbols = random.nextInt(bound);
            String nextSymbol = returnRandomSymbolFromArray(array[setOfSymbols]);
            if (nextSymbol.equals(previousSymbol)) {
                continue;
            } else {
                if (setOfSymbols == 2) {
                    password = password.concat(nextSymbol);
                    bound = 2;
                } else {
                    if (setOfSymbols == 1) {
                        countOfNumbers++;
                        if (countOfNumbers == 3) {
                            bound = 1;
                        }
                    }
                    password = password.concat(nextSymbol);
                    previousSymbol = nextSymbol;
                }

            }
        }

        System.out.println(password);

    }

    private static String returnRandomSymbolFromArray(String line) {
        Random random = new Random();
        int choice = random.nextInt(line.length());
        return line.substring(choice, choice + 1);
    }


}
