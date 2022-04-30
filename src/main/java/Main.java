import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<Float> floatList = new ArrayList<>();
       for (int i = 0; i < 30_000_000; i++)
       { floatList.add((float)i);
       }
       long before = System.currentTimeMillis();
       floatList.stream()
               .map((in) ->Math.sin(0.2f + in / 5) * Math.cos(0.2f + in / 5) * Math.cos(0.4f + in / 2))
               .collect(Collectors.toList());

       long after = System.currentTimeMillis();
        System.out.println(after - before);
                }

    public static List<Integer> filter(List<Integer> listNotFiltred, Predicate d) {
        List<Integer> listFiltred = new ArrayList<>();
        for (int j : listNotFiltred) {
            if (d.test(j)) {
                listFiltred.add(j);
            }
        }
        return listFiltred;
    }
}
