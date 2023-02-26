package kinshuk.com.Generics_and_Collection_Framework.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class GenericsList {
    public static void main(String[] args) {
        ArrayList<Integer> empIDList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<String>();

        empIDList.add(45);
//        empIDList.add("Kinshuk"); Generics int do not allow strings
        nameList.add("Kinshuk");
        nameList.add("Kunaal");
//        nameList.add(878); Generics string do not allow int

        for(String k: nameList){
            System.out.println(k);
        }
        for(int l: empIDList){
            System.out.println(l);
        }
    }
}