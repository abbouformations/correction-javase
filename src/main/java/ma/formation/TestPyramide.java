package ma.formation;

public class TestPyramide {
    public static void drowLine(int nbr, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbr; i++) {
            sb.append(c);
        }
        System.out.print(sb);
    }

    public static void drowPyramide(int hauteur, int ligne) {

        if (hauteur == ligne) {
            return;
        }
        int spaces = hauteur - ligne;
        int stars = 2 * ligne - 1;
        drowLine(spaces, ' ');
        drowLine(stars, '*');
        drowLine(spaces, ' ');
        System.out.println();
        ligne += 1;
        drowPyramide(hauteur, ligne);
    }

    public static void main(String[] args) {
        drowPyramide(5, 1);
    }
}
