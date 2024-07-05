import java.util.Scanner;
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
class floydTriangle{
	public static void main(String[] args) {
		int num = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows : ");
		n = sc.nextInt();
		sc.close();

		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}
}