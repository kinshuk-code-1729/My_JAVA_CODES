import java.util.Scanner;
class evenoddjava {
	public static void main(String args[]){
		int x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		x = s.nextInt();
		if(x%2!=0){
        System.out.println(x + " is an odd number");
		}
        else{
            System.out.println(x + " is an even number");
		}
	}
}