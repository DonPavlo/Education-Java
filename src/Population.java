public class Population {
    public static void main(String[] args) {
        double nas = 10000000;
        for (int i = 0; i < 10; i++) {
            double rod = 14.0 / 1000.0;
            rod *= nas;
            double smert = 8.0 / 1000.0;
            smert *= nas;
            double popular = rod - smert;
            nas += popular;
        }
        System.out.println((int) nas);
    }
}
