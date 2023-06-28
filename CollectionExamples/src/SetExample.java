
import java.util.*;

public class SetExample {

    void func() {
        Set st = new HashSet();
        st.add("Noodles");
        st.add("Pepsi");
        st.add(1524);
        st.add(78.36);
        st.add("Venum");
        st.add("Venum");
        System.out.println(st);
        System.out.println("No. of items : " + st.size());
        
        if(st.contains("Pepsi"))
        {
            System.out.println(st);
            System.out.println("Item Found ....");
        }
        else
        {
            System.out.println("Item Not Found");
        }
    }

    public static void main(String args[]) {
        SetExample o1 = new SetExample();
        o1.func();
    }
}
// []
