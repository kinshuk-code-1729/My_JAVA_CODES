package kinshuk.com.Generics_and_Collection_Framework.List;
import java.util.ArrayList;
public class ListTest1 {
    public static void main(String[] args) {
        ArrayList numList = new ArrayList();
        numList.add("RED Pen");
        numList.add("BLUE Pen");
        numList.add("RED Pen");
        numList.add("GREEN Pen");
        numList.add("BLACK Pen");
        numList.add(73.145);
        numList.add("GREEN Pen");
        numList.add(2023);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println("COLOUR Pens : "+numList.get(i));
        }
        System.out.println("*************************************");
        for(Object x: numList)
        {
            System.out.println("COLOUR Pens : "+x);//.get not required here
            System.out.println("COLOUR Pens : "+x.getClass());
        }

    }
}
