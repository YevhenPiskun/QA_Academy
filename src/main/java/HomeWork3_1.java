import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println("Выберите действие со строкой(a, b, c, d, e, f): ");
        char[] choice = reader.readLine().toCharArray();
        switch (choice[0]) {
            case 'a':
                System.out.println(line.toUpperCase());
                break;
            case 'b':
                System.out.println(line.toLowerCase());
                break;
            case 'c':
                String arrWords1[] = line.split(" ");
                for (int i = 0; i < arrWords1.length; i++) {
                    System.out.print(arrWords1[i].substring(0, 1).toUpperCase() + arrWords1[i].substring(1) + " ");
                }
                System.out.println();
                break;
            case 'd':
                String arrWords2[] = line.split(" ");
                for (int i = 0; i < arrWords2.length; i++) {
                    System.out.print(arrWords2[i].substring(0, 1).toLowerCase() + arrWords2[i].substring(1) + " ");
                }
                System.out.println();
                break;
            case 'e':
                String arrWords3[] = line.split(" ");
                System.out.print(arrWords3[0].substring(0, 1).toUpperCase() + arrWords3[0].substring(1) + " ");
                for (int i = 1; i < arrWords3.length; i++) {
                    System.out.print(arrWords3[i] + " ");
                }
                System.out.println();
                break;
            case 'f':
                break;
        }
    }
}
