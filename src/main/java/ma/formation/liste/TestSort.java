package ma.formation.liste;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("ZER","BC","JJ");
        Collections.sort(list,new MonComparator());

        for (String s:list)
            System.out.println(s);


    }
}

class MonComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
