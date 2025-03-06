public class fibonachi {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 1;
        System.out.print(1);
        System.out.print(1);
        for (int i = 0; i <= 10; i++) {
            int fib = x2 + x1;
            x1 = x2;
            x2 = fib;
            System.out.print(fib);
        }
    }

}
