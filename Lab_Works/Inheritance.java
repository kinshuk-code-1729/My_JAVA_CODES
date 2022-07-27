// Program to demonstrate inheritance in java.
package Lab_Works;
public class Inheritance{
    int c;
    public void add(int a, int b) {
        c = a + b;
        System.out.println("Addition = "+c);
    }
    public void Sub(int a, int b) {
        c = a - b;
        System.out.println("Subtraction = "+c);
    }
}
    class Calc extends Inheritance {
        public void mult(int a, int b) {
            c = a * b;
            System.out.println("Multiplication = " + c);
        }
    public static void main(String[] args) {
        int x = 40, y = 20;
        Calc demo = new Calc();
        demo.add(x, y);
        demo.Sub(x, y);
        demo.mult(x, y);
    }
}
