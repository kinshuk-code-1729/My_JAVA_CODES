package Recursion;
import java.util.Scanner;
class fibonacci{
    public int fibo(int k){
        if(k == 1){
            return 0;
        }
        else if (k == 2){
            return 1;
        }
        else {
            return fibo(k - 1)+fibo(k - 2);
        }
    }
}
public class Recur_Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        fibonacci fib = new fibonacci();
        int n;
        System.out.print("Enter last term of series : ");
        n = s.nextInt();
        System.out.println("\nThe fibonacci series upto term "+n+" is ...");
        for (int i = 1; i <= n; i++){
            System.out.print(fib.fibo(i)+",");
        }
        System.out.println("......");
    }
}
