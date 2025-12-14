package ma.formation.exercices;


/**
 *
 * On ne peut pas appeler une méthode non static dans une méthode static
 * On peut appeler une méthode static dans une méthode non static
 */

 public class Frodo extends Hobbit {
 public static void main(String[] args) {
         Short myGold = 7;
         System.out.println(countGold(myGold, 6));
        }
 }
class Hobbit {
static int countGold(int x, int y) { return x + y; }
}