
import java.util.*;

public class SetExample2 {

    SetExample2() {
        Set st2 = new HashSet();

        st2.add("Noodles");
        st2.add("Fanta");
        st2.add("Real");
        st2.add("Bisleri");
        st2.add("7-Up");
        st2.add("Limca");

        System.out.println(st2);
        System.out.println("No's : " + st2.size());

        System.out.print("Enter Search Element : ");
        Scanner s = new Scanner(System.in);
        String str = s.next();

        if (st2.contains(str)) {
            System.out.println("Found....");
        } else {
            System.out.println("Not Found......");
        }
    }

    public static void main(String args[]) {
        SetExample2 o1 = new SetExample2();
    }
}
