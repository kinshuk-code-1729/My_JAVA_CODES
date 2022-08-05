// JAVA Program to Solve Second Order Quadratic Equation.
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        int a,b,c,dmt;
        double r1,r2;
        Scanner s = new Scanner(System.in);
        System.out.println("For a standard quadratic equation,ax^2+bx+c=0,Enter the coefficients below");
        System.out.print("Enter a : ");
        a = s.nextInt();
        System.out.print("Enter b : ");
        b = s.nextInt();
        System.out.print("Enter c : ");
        c = s.nextInt();
        if(a==0) System.out.println("Value of a should not be zero !!! , Please enter a non-zero number");
        else{
            dmt = (b*b) - (4*a*c);
            if(dmt>0){
                r1 = (-b + Math.sqrt(dmt)) / (2*a);
                r2 = (-b - Math.sqrt(dmt)) / (2*a);
                System.out.println("We Get Two DISTINCT REAL ROOTS");
                System.out.println("root 1 = "+r1+" & root 2 = "+r2);
            }
            else if(dmt==0){
                r1 = r2 = -b/(2.0*a);
                System.out.println("We Get Two EQUAL REAL ROOTS");
                System.out.println("root 1 = "+r1+" & root 2 = "+r2);
            }
            else System.out.println("No REAL ROOTS of the QUADRATIC EQUATION");
        }
    }
}
