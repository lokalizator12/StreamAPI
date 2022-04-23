import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list1.add((int) (Math.random() * 1000));
        }

        List<Integer> list2 = filter(list1, (n) -> n > 0);
        for (int g : list2) {
            System.out.println(g);
        }
        System.out.println("-------------------------------------------------");

        List<Integer> list3 = filter(list1, (a) -> a % 5 == 0);
        for (int g : list3) {
            System.out.println(g);
        }


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
