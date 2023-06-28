
import java.util.*;

public class StackExample {

    StackExample() {
        Stack stk = new Stack();
        stk.push("Tabla");
        stk.push("Piano");
        stk.push("Guitar");
        stk.push("Dholak");
        stk.push("Flute");

        System.out.println(stk);
        System.out.println("No. of items = " + stk.size());
        System.out.println("\n----------------\n");
        
//        System.out.println(stk.pop());
        
        System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println("No. of items = " + stk.size());
    }

    public static void main(String args[]) {
        StackExample ste = new StackExample();
    }
}
