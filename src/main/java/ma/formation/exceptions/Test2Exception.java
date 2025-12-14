package ma.formation.exceptions;

public class Test2Exception {

    public static void main(String[] args) {
        String s="toto";
        int i=0;

        try {
            i = Integer.parseInt(s);
        }

        catch (Exception e) {
            System.out.println("#########exception de type Exception###########");
            e.printStackTrace();
        }
        finally {
            i=-1;
            System.out.println("code traité dans tous les cas");
        }
    }
}
