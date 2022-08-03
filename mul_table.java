// Program to generate multiplication table of a number.
import java.util.Scanner;
public class mul_table{
    public static void main(String[] args) {
        int num,k,tab;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        num = s.nextInt();
        System.out.println("Table of "+num+" is given below");
        for(k=1;k<=10;k++){
            tab = num * k;
            System.out.println(num+" X "+k+" = "+tab);
        }
    }
}
