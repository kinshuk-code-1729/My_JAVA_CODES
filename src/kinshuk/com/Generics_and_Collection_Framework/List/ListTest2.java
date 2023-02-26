package kinshuk.com.Generics_and_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
//        List<String> fruitLst = new ArrayList<String>();
        List<String> fruitLst = new ArrayList<>();
        fruitLst.add("Guava");
        fruitLst.add("Coconut");
        fruitLst.add("Pineapple");
        fruitLst.add(null);

        System.out.println(fruitLst.get(1));
        fruitLst.add(1,"Banana");
        System.out.println(fruitLst.get(2));
        System.out.println(fruitLst.size());
        fruitLst.remove("Pineapple");
        fruitLst.set(2,"Blackberry");

        for(String i: fruitLst){
            System.out.println("Its present");
        }
        if (fruitLst.contains("Guava")){
            System.out.println("Its Present");
        }
        else{
            System.out.println("Its Not present");
        }
        fruitLst = new LinkedList<>();
    }
}
