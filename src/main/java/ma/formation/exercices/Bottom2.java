package ma.formation.exercices;

class Top {
   public Top() {
       super();
    }
    public Top(String s) { System.out.print("C"); }
}
public class Bottom2 extends Top {
    public Bottom2(String s) {
        super(s);
        System.out.print("D");
    }
    public static void main(String [] args) {
        new Bottom2("C");
        System.out.println(" ");
    } }