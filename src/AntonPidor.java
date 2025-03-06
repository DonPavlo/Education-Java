public class AntonPidor {
    public static void main(String[] args) {
        Vector popa = new Vector(5, 8, 15);
        Vector popa2 = new Vector(1, 7, 10);
        System.out.println(popa.length());
        System.out.println(popa.scalar(popa2));
        System.out.println(popa.antonPidor(popa2));
    }
}

class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        double pip = Math.sqrt(x * x + y * y + z * z);
        return pip;
    }

    int scalar(Vector kek) {
        int pip2 = this.x * kek.x + this.y * kek.y + this.z * kek.z;
        return pip2;
    }

    int antonPidor(Vector lol) {
        int pip3 = this.y * lol.z - this.z * lol.y;
        int pip4 = this.z * lol.x - this.x * lol.z;
        int pip5 = this.x * lol.y - this.y * lol.x;
        return pip3 + pip4 + pip5;
    }
}