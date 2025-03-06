package Interfaces;

public class Denis implements Info {
    public String name;

    public Denis(String name) {
        this.name = name;
    }

    public void sayDenis() {
        System.out.println("Я Денис");
    }

    @Override
    public void showInfo() {
        System.out.println("Пью хуч в интерфейсах " + this.name);
    }
}
