package ma.formations;

public class TestFactorial {
    public static double factorial(double r) {
        if (r == 1)
            return 1;
        return r * factorial(r - 1);
    }

    public static void main(String[] args) {
        double a = 7;
        System.out.println(factorial(a));
    }
}
