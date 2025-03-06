class Person {

    String name;
    int age;

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

public class konstruktor {

    public static void main(String[] args) {

        Person tom = new Person();// создание объекта
        tom.displayInfo();

        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 35;
        tom.displayInfo();
    }
}

