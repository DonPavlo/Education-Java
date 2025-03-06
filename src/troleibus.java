import java.util.Scanner;

public class troleibus {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            Scanner in = new Scanner(System.in);
            System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
            String prav = in.nextLine();
            switch (prav) {
                case "тралик":
                    System.out.println("Правильно!");
                    return;
                case "Сдаюсь!":
                    System.out.println("Правильный ответ: троллейбус");
                    return;
                default:
                    System.out.println("Подумай еще");
                    i++;
            }
        }

    }
}
