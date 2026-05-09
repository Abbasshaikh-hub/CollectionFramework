package ArrayList;

import java.util.List;

public class List_of {
    static void main(String[] args) {

       List<Integer> list3 = List.of(1,2,3,4);
       // We can't replace any element in List.of its not acceptable!!
       list3.set(2,10);
    }
}
