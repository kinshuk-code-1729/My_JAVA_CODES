import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact=1,num,i=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = s.nextInt();
        do{
            fact*=i;
            i++;
        } while(i<=num);
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
