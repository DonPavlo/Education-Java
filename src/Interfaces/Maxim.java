package Interfaces;

public class Maxim implements Info {
    public int id;

    public Maxim(int id) {
        this.id = id;
    }

    public void sayMaxim() {
        System.out.println("Я панк");
    }

    public void showInfo() {
        System.out.println("Панкую в интерфейсах " + this.id);
    }
}
