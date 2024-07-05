import java.util.Scanner;
/*
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 */
class pascalTriangle{
	public int fact(int num){
		if(num == 0){
			return 1;
		}
		return num * fact(num - 1); 
	}

	public static void main(String[] args) {
		pascalTriangle pt = new pascalTriangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows : ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i <= n ; i++) {
			
			// Print spaces
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print factorial values
			for(int k = 0; k <= i; k++){
				System.out.print(" "+pt.fact(i)/(pt.fact(i - k) * pt.fact(k)));
			}
			
			// Print new line after row completed
			System.out.println();
		}
	}
}