import java.util.Scanner;
/*
  	*
   **
  ***
 ****
*****
 */
class pattern4{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();

		for(int i = 1; i <= n; i++){
			for(int j = n - 1; j >= i; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}