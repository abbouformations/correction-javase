package ma.formation.exceptions;

public class Test3Exception {

    public static void main(String[] args) {
        double[] test=new double[3];

        for(int i=0;i<3;i++) {
            test[i]=Math.log(i);
        }
        try {
            for(int i=0;i<4;i++) {
                System.out.println("log("+i+") = "+test[i]);
            }
        } catch(ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
            System.out.println("arrivé à la fin du tableau");
        }
        System.out.println("continuer le constructeur");
    }
}
