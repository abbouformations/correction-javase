package ma.formation.exceptions;

public class Test4Exception {

    public void test(int i) throws BusinessException {

        if (i==-1)
          throw new BusinessException("A001");

        if (i==0)
            throw new BusinessException("A002");

    }


    public static void main(String[] args) {
        Test4Exception test4Exception=new Test4Exception();

        try {
            test4Exception.test(-1);
        }
        catch (BusinessException e) {
            System.out.println("la régle de gestion " + e.getMessage() + " n'est pas respectée");
        }
    }

}
