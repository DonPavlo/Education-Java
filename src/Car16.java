class Car16 extends Vehicle {
    int numDoors;

    public Car16(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество дверей: " + numDoors);
    }
}
