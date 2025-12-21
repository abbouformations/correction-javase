package ma.formation.serialization;

import lombok.*;

import java.io.*;

public class TestSerialization {
    private static final String FILE_NAME = "objet";

    public static void main(String[] args) {
        Personne p = Personne.builder().firstname("ahmed").lastname("alami").build();
        serializer(p);
        System.out.println(deserializer());
    }

    public static void serializer(Personne p) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Personne deserializer() {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            if (o instanceof Personne)
                return (Personne) o;
            return null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
class Personne implements Serializable {
    private String firstname;
    private String lastname;
}
