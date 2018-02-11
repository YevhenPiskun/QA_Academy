
public class HomeWork2_2 {

    public static void main(String[] args) {
        long count = 1234567890;
        int max = 0;
        int min = 9;
        do {
            int number = (int) (count % 10);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            count = count / 10;
            if (count < 0.1) {
                break;
            }
        } while (true);
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

}
