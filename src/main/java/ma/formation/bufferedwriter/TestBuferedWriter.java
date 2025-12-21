package ma.formation.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuferedWriter {

    private static final String FILE_NAME="example2.txt";

    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter(FILE_NAME);
            BufferedWriter bw =new BufferedWriter(fw);//créer le filtre
            bw.write("ceci est ma première ligne ");
            bw.newLine();
            bw.write("ceci est ma deuxième ligne ");
            bw.newLine();
            bw.write("ceci est ma troisième ligne ");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
