import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //бесконечный цикл. Пока вводим "0", все работает
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new IOException();
            }
        }
    }
}
