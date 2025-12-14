package ma.formation.exceptions;

public class TestException {

    public static void main(String[] args) {
        String s="toto";
        int i=0;

        try {
            i = Integer.parseInt(s);

        }


        catch (NumberFormatException e) {
            System.out.println("#########exception de type NumberFormatException###########");
            e.printStackTrace();
        }

        catch ( IllegalArgumentException e) {
            System.out.println("#########exception de type IllegalArgumentException###########");
            e.printStackTrace();
        }

        catch (RuntimeException e) {
            System.out.println("#########exception de type RuntimeException###########");
            e.printStackTrace();
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
