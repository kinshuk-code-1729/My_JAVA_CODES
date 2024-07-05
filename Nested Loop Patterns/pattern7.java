import java.util.Scanner;
/*
1
21
321
4321
54321
 */
class pattern7{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();

		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j); // use i for pattern like 1\n22\n333\n4444 etc
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= n; i++){
			for(int j = i; j >= 1; j--){
				System.out.print(j); // use i for pattern like 1\n22\n333\n4444 etc
			}
			System.out.println();
		}
	}
}