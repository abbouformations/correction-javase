package ma.formations;

import java.util.Scanner;

public class TestNotes {

    public static void main(String[] args) {
        System.out.println("Entrer le nombre des étudients");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Entrer les " + n + " notes");
        double[] notes = new double[n];
        int nombreEtudiantsReussis = 0;
        int nombreEtudiantsEchoues = 0;
        double moyenneG = 0;
        double moyenneR = 0;
        double moyenneE = 0;

        for (int i = 0; i < n; i++) {
            scanner = new Scanner(System.in);
            notes[i] = scanner.nextDouble();
            moyenneG += notes[i];
            if (notes[i] >= 10) {
                nombreEtudiantsReussis++;
                moyenneR += notes[i];
            } else {
                nombreEtudiantsEchoues++;
                moyenneE += notes[i];
            }
        }
        moyenneG /= n;
        moyenneR /= nombreEtudiantsReussis;
        moyenneE /= nombreEtudiantsEchoues;

        System.out.println("nombre des étudiants : " + n);
        System.out.println("nombre des étudiants réussis: " + nombreEtudiantsReussis);
        System.out.println("nombre des étudiants echoues: " + nombreEtudiantsEchoues);
        System.out.println("moyenne generale: " + moyenneG);
        System.out.println("moyenne Réussis: " + moyenneR);
        System.out.println("moyenne Echoués: " + moyenneE);


    }
}
