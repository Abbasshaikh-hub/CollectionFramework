package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
    static void main(String[] args) {

        List<String> list1 = Arrays.asList("January","March");
        System.out.println(list1.getClass().getName());
        // We can't add or remove Element in  asList
//        list1.add("Wednesday");

        // But we can replace its Element through index
        list1.set(1,"December");
        System.out.println(list1);

        System.out.println();

        String[] array = {"Apple", "Banana", "Mango"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2);


        List<String> anotherlist = Arrays.asList("Kutta", "Billi", "Chuha", "Gadha");
        ArrayList<String> listfromCollection = new ArrayList<>(anotherlist);
        listfromCollection.add("BHALU");
        listfromCollection.add("JANAWAR");
        System.out.println(listfromCollection);

    }
}
