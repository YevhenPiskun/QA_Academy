import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2_1 {

    public static void main(String[] args) throws IOException {
        String kurs = "Курс: Java Core";
        String student = "Студент";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ФИО: ");
        String fio = reader.readLine();
        int maxLength = returnMaxLengthString(kurs, student, fio);
        displayStars(maxLength + 4);
        writeWordWithSnows(kurs, maxLength);
        writeWordWithSnows(student, maxLength);
        writeWordWithSnows(fio, maxLength);
        displayStars(maxLength + 4);

    }

    private static void displayStars(int stars) {    //Метод выводит указанное количество звезд
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static int returnMaxLengthString(String str1, String str2, String str3) {  //Метод возвращает максимальную длину строки
        int max = str1.length();
        if (str1.length() < str2.length()) {
            max = str2.length();
        }
        if (str3.length() > max) {
            max = str3.length();
        }
        return max;
    }

    private static void writeWordWithSnows(String str, int maxLengthOfString) { //Метод выводит строку со звездочками по краям
        int firstSpace = (maxLengthOfString - str.length()) / 2;
        int secondSpace = maxLengthOfString - firstSpace - str.length();
        System.out.print("*");
        addSpaces(firstSpace + 1);
        System.out.print(str);
        addSpaces(secondSpace + 1);
        System.out.print("*");
        System.out.println();
    }

    private static void addSpaces(int countOfSpaces) { //Метод выводит заданное количество пробелов
        for (int i = 0; i < countOfSpaces; i++) {
            System.out.print(" ");
        }
    }
}
