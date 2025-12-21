package ma.formation.inputstream;

import java.io.*;

public class TestInputStream {

    private static final String FILE_NAME="test";

    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream(FILE_NAME);
            FileInputStream fis=new FileInputStream(FILE_NAME);

            byte[] data={1,2,3,4,5,6,7,8,9};
            byte[] result=new byte[9];

            fos.write(data);
            int nbre = fis.read(result);

            System.out.println("Le nombre d'octets lus est : " + nbre);
            for (byte b:result)
                System.out.println(b);

            fos.close();
            fis.close();

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
