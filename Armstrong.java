// Program to check whether any 'n' digit number is an Armstrong Number or not.
import java.util.Scanner;
class Armstrong{
    int power(int m,int n){
        int pow = 1;
        for (int i = 0; i < m; i++) {
            pow *= n;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Armstrong ast = new Armstrong();
        int x,temp,ttl_digits = 0,digit,p,s = 0;
        System.out.print("Enter a number : ");
        x = sc.nextInt();
        temp = x;
        while(temp != 0){
            ttl_digits++;
            temp /= 10;
        }
        System.out.println("Number of Digits = "+ttl_digits);
        temp = x;
        while(temp != 0){
            digit = temp % 10;
            p = ast.power(ttl_digits,digit);
            System.out.println("Power = "+p);
            s += p;
            temp /= 10;
        }
        if (x == s) {
            System.out.println(x+" is an Armstrong Number");
        }
        else {
            System.out.println(x+" is not an Armstrong Number");
        }
    }
}
