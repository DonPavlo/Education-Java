public class Dog extends Animal {
    public void bark() {
        System.out.println("Гаф");
    }

    @Override
    public void eat() {
        System.out.println("Я ем собачий корм ");
    }

    public void sleep() {
        System.out.println("Я сплю как собака ");
    }
}
