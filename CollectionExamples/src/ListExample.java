
import java.util.List;
import java.util.ArrayList;

public class ListExample {

    ListExample() {
        List ls = new ArrayList();
        /*ls.add("Noodles"); // 0
        ls.add("Pepsi"); // 1
        ls.add(1524); // 2
        ls.add(78.36); // 3
        ls.add("Venum"); // 4
        ls.add("Noodles"); // 5
        ls.add(8000); // 6*/

        if (ls.isEmpty()) 
        {
            System.out.println("List is Empty ");
        }
        else 
        {
            System.out.println(ls);
            System.out.println("No. of items : " + ls.size());
        }
//        System.out.println("\n----------------\n");

//        ls.add(3, "Minerals");
//        ls.set(1, "Sprite"); // replaces a value
//        ls.remove("Noodles");
//        ls.clear();
//        System.out.println(ls);
//        System.out.println("No. of items : " + ls.size());
//        System.out.println(ls.get(1));// finds a value at an index
    }

    public static void main(String args[]) {
        ListExample o2 = new ListExample();
    }
}
