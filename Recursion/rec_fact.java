// Program to find factorial of a number using recursion.
package Recursion;
import java.util.Scanner;
class factorial{
    int fact(int x){
        if(x == 1){
            return x;
        }
        else {
            return x * fact(x - 1);
        }
    }
}
public class rec_fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial f = new factorial();
        int num,ftrl;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        if(num < 0){
            System.out.println("Sorry !!!, factorial for a negative number does not exist");
        }
        else if (num == 0){
            System.out.println("Factorial of Zero is one!!!!");
        }
        else{
            ftrl = f.fact(num);
            System.out.println("Factorial of "+num+" is "+ftrl);
        }
    }
}
