import java.util.Scanner;

/* 
****          ****      **
****          ****      **
****                    **
****                    **
*/
class pattern1{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();
		
		System.out.println("Full pattern");
		for (int i=1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
		}

		System.out.println("\n\nHalf rows pattern");
		for (int i=1; i <= n/2; i++) {
			System.out.println();
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
		}

		System.out.println("\n\nHalf column pattern");
		for (int i=1; i <= n; i++) {
			System.out.println();
			for (int j = 1; j <= n/2; j++) {
				System.out.print("*");
			}
		}

	}
}