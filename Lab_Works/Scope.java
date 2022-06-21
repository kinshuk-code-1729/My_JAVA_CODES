// Program to show Scope of Variables
package Lab_Works;
public class Scope{
    static int m = 25;
    private int k = 87;
    public void func(int t){
        Scope s = new Scope();
        this.m = 57;
        k = 67;
        System.out.println("Scope.m = "+Scope.m);
        System.out.println("s.m = "+s.m);
        System.out.println("s.k = "+s.k);
        System.out.println("k = "+k);
    }
    public static void main(String[] args){
        Scope o = new Scope();
        o.func(6);
    }
}
