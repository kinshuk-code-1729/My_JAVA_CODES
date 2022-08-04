// Finding the sum of digits of a number.
import java.util.Scanner;
class DigitsSum{
    public static void main(String[] args) {
        int rem,n,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(n != 0){
            rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of the digits : "+sum);
    }
}
