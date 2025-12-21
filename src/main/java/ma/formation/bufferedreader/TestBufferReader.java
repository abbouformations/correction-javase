package ma.formation.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {

    private static final String FILE_NAME="example.txt";

    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader(FILE_NAME);
            BufferedReader br=new BufferedReader(fr);//créer un filtre
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
