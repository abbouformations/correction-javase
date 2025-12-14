package ma.formation.varargs;

/**
 * Régles de gestion pour VARARGS :
 *
 * RG1 : l'argument VARARG doit être le dernier.
 * RG2 : un seul argument de type VARARG dans la méthode.
 * RG : la JVM exécute la surcharge avec VARARG en dernier.
 */
public class TestVarargs {

     public static void test(String... s) {
        System.out.println("exécution de la méthode test(String... s)");
    }

    public static void test(String s) {
        System.out.println("exécution de la méthode test(String s)");
    }

    public static void test(String s1,String s2) {
        System.out.println("exécution de la méthode test(String s1,String s2)");
    }

    public static void test(Object s1,Object s2,Object s3) {
        System.out.println("exécution de la méthode test(Object s1,Object s2,Object s3)");
    }


    public static void main(String[] args) {

        test("A","b","c","d");


    }


}
