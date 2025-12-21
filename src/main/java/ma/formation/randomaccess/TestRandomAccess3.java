package ma.formation.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccess3 {
    private static final String FILE_NAME = "data";

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("data", "rw");
            raf.seek(5 * 4);
            raf.writeInt(777);
            raf.close();

            RandomAccessFile in = new RandomAccessFile("data", "r");
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
