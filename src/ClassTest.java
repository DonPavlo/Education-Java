public class ClassTest {
    public static void main(String[] args) {
        Car VW = new Car();
        VW.HP = 120;
        VW.Marka = "Поло";
        VW.speak();
        Car Opel = new Car();
        Opel.HP = 80;
        Opel.Marka = "astra";
        Opel.speak();
    }
}

class Car {
    int HP;
    String Marka;

    void speak() {
        System.out.println("Марка " + Marka + " сил " + HP);
    }
}
