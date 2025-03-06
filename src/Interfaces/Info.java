package Interfaces;

public interface Info {
    /* Следующий метод будет работать, если в классе не будет реализации метода showInfo. В таком случае необходимо
    прописать слово default */
    default void showInfo() {
        System.out.println("хз что");
    }
}
