import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите время в минутах: ");
        String minutesLine = reader.readLine();
        System.out.println("Введите расстояние в км: ");
        String rastoyanieLine = reader.readLine();
        Double minutesDouble = Double.parseDouble(minutesLine);
        Double rasstoyanieDouble = Double.parseDouble(rastoyanieLine);
        double skorost = rasstoyanieDouble / (minutesDouble / 60);
        System.out.println("Скорость: " + skorost);

    }
}
