import java.util.Scanner;
/*
5
54
543
5432
54321
 */
class pattern9{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();

		for(int i = n; i >= 1; i--){
			for(int j = n; j >= i; j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}
}