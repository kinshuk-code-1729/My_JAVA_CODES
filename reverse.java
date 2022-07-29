// Find reverse of a number.
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int num,rev=0,rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = s.nextInt();
        while(num != 0){
            rem = num%10;
            rev = rev * 10 + rem;
            num/=10;
        }
        System.out.println("Reversed number is "+rev);
    }    
}
