import java.util.Scanner;
/*
1
12
123
1234
12345
*/
class pattern8{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();

		for(int i = 1; i <= n; i++){  // for i=n to i >= 1 with i-- for inversion
			for(int j = 1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print(k);
			}
			System.out.println();
		}

	}
}