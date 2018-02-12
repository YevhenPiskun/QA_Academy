import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fio = reader.readLine();
        Pattern pattern = Pattern.compile("^([A-Za-z])$");
        Matcher match = pattern.matcher(fio);
        System.out.println(match.matches());
    }
}
