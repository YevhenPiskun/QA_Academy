import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PasswordGenerator {

    static final int LOW_BOUND = 8;
    static final int HIGH_BOUND = 20;
    static final String SYMBOL = "!@#$%^&*";
    static final String NUMBER = "0123456789";
    static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите длину пароля: ");
            String line = reader.readLine();
            int passwordLength = Integer.parseInt(line);
            if (passwordLength > LOW_BOUND && passwordLength < HIGH_BOUND) {
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

        //Random rand = new Random();
        //int r = rand.nextInt(RANDOM_BOUND);
        //System.out.println(r);


    }


}
