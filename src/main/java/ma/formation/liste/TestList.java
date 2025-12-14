package ma.formation.liste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Personne> l=new ArrayList();

        Personne p1=new Personne("Alami","Mohammed");
        Personne p2=new Personne("ddd","eede");
        Personne p3=new Personne("rrr","frgfrg");
        Personne p4=new Personne("npm_p4","prenom_p4");

        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p1);



    }
}


@Data
@AllArgsConstructor
@ToString
class Personne {
    private String nom;
    private String prenom;
}
