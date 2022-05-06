// Generate the Fibonacci Series starting from any two numbers
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int x,y,z,i,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value of \'n\' : ");
        n = s.nextInt();
        System.out.print("Enter 1st term value : ");
        x = s.nextInt();
        System.out.print("Enter 2nd term value : ");
        y = s.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms : ");
        for(i=1;i<=n;i++){
            System.out.print(x + ", ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}
