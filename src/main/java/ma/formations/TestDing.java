package ma.formations;

public class TestDing {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println("Bottle");
            } else if (i % 7 == 0) {
                System.out.println("Ding Ding");
            } else {
                System.out.println(i);
            }
        }
    }
}
