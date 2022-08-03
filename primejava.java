// Program to check whether a number is prime or not.
import java.util.Scanner;
class primejava{
	public static void main(String args[]){
		int n,x = 0,y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		n = s.nextInt();
		for(y = 2 ; y <= n/2 ; y++){
			if(n % y == 0){
				x = 1;
				break;
			}
		}
	if(x == 0) System.out.println(n + " is a prime number");
	else System.out.println(n + " is not a prime number");
    }
}
