package ma.formation.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccess {
    private static final String FILE_NAME = "data";

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("data", "rw");

            for (int i = 0; i < 10; i++) {
                raf.writeInt(i * 100);
            }
            raf.close();

            RandomAccessFile in = new RandomAccessFile("data", "rw");
            for (int i = 0; i < 10; i++) {
                System.out.println(in.readInt());
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
