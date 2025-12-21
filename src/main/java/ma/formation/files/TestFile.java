package ma.formation.files;

import java.io.File;

public class TestFile {

    private static final String PATH_NAME="c:/workspace";

    public static void lireDossier(File directory) {

        if (directory.isDirectory()) {
            String[] files = directory.list();
            for (String fileName:files) {
                System.out.println(fileName);
            }
        }
    }

    public static void main(String[] args) {
      lireDossier(new File(PATH_NAME));
    }
}
