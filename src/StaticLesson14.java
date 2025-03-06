public class StaticLesson14 {
    public static void main(String[] args) {
        Persons tom = new Persons();
        Persons bob = new Persons();
        Persons ded = new Persons();
        Persons pol = new Persons();
        tom.displayId();
        bob.displayId();
        ded.displayId();
        pol.displayId();
        System.out.println(Persons.counter);
        Persons.counter = 8;
        Persons lol = new Persons();
        lol.displayId();
    }
}

class Persons {
    private final int id;
    static int counter = 1;

    Persons() {
        id = counter++;
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }
}

