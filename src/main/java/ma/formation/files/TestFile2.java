package ma.formation.files;

import java.io.File;

public class TestFile2 {

    private static final String PATH_NAME="c:\\workspace";

    public static void lireDossier(File directory) {

        if (directory.isDirectory()) {
            String[] files = directory.list();
            for (String fileName:files) {
                File f2=new File(directory.getAbsolutePath() + "\\" + fileName);
                if (f2.isDirectory())
                    lireDossier(f2);
                else System.out.println(f2.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {

        lireDossier(new File(PATH_NAME));
    }
}
