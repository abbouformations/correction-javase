package ma.formation.scanner;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestScanner2 {
    private static final String FILE_NAME = "personnes.txt";
    private final List<Personne> personnes = new ArrayList<>();

    public static void main(String[] args) {
        TestScanner2 test = new TestScanner2();
        test.read(FILE_NAME);
        for (Personne p : test.personnes)
            System.out.println(p);
    }

    public void read(String filename) {
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String line = br.readLine();
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");
                personnes.add(Personne.builder().
                        firstname(scanner.next()).
                        lastname(scanner.next()).
                        age(scanner.nextDouble()).
                        build());
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
class Personne {
    private String firstname;
    private String lastname;
    private Double age;
}
