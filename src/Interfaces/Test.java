package Interfaces;

public class Test {
    public static void main(String[] args) {
        Maxim maxim1 = new Maxim(18);
        Denis denis1 = new Denis("Хуч");
        outputInfo(maxim1);
        outputInfo(denis1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
