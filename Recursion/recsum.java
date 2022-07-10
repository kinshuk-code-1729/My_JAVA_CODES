package Recursion;
import java.util.Scanner;
class sum_n{
    int sum(int u,int v){
        if(u == v){
            return u;
        }
        else {
            return u + sum(u + 1 , v);
        }
    }
}
public class recsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum_n rs = new sum_n();
        int x,y,s;
        System.out.print("Enter 1st num : ");
        x = sc.nextInt();
        System.out.print("\nEnter 2nd num : ");
        y = sc.nextInt();
        s = rs.sum(x,y);
        System.out.println("\nSum is = "+s);
    }
}
