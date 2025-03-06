public class BookStore {
    public static void main(String[] args) {
        Book one = new Book("Путешествие в Сочи", "Антон", 500);
        System.out.println(one.getPrice());
        System.out.println(one.getTravelToSochi());
    }
}

class Book {
    String travelToSochi;
    String Anton;
    int price;

    public Book(String travelToSochi, String Anton, int price) {
        this.travelToSochi = travelToSochi;
        this.Anton = Anton;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getTravelToSochi() {
        return travelToSochi;
    }
}

