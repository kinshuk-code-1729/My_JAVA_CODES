package Recursion;
import java.util.Scanner;
class test_sum{
    int sum(int d){
        int rem;
        rem = d%10;
        if(d == 0){
            return 0;
        }
        return rem + sum(d / 10);
    }
}
public class sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test_sum ds = new test_sum();
        int num,s;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        s = ds.sum(num);
        System.out.println("Sum of Digits = "+s);
    }
}
