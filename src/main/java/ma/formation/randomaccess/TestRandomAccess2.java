package ma.formation.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccess2 {
    private static final String FILE_NAME = "data";

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("data", "rw");
            raf.seek(4 * 4);
            System.out.println(raf.readInt());
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
