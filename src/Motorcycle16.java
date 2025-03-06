public class Motorcycle16 extends Vehicle {
    boolean hasSidecar;

    public Motorcycle16(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие боковой коляски: " + (hasSidecar ? "Да" : "Нет"));
    }
}
