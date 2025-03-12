import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Exceptions1 {
    public static void main(String[] args) {
    File file = new File("какой то файл"); //пытаемся найти файл, которого не сущетсвует
    try{
        Scanner scanner = new Scanner(file);
    }
    catch (FileNotFoundException e){
        System.out.println("Файл не найден");
    }
        System.out.println("Продолжаю работать после блока try catch");
    }
}
