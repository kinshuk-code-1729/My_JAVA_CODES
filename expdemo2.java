import java.util.Scanner;
class expdemo2
{
	void f1()
	{
		try
		{
			int arr[] = new int[5];
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Array Elements .......");
			for (int i=0;i<5 ;i++ ) {
				System.out.print("Element "+(i+1)+" : ");
				arr[i] = s.nextInt();
				System.out.println();
			}
			System.out.println("Array Elements.......");
			for (int i=0;i<=5 ;i++ ) {
				System.out.print(arr[i]+"\t");
			}
		}
		catch(ArrayIndexOutOfBoundsException z)
		{
			System.out.println("\n"+z);
		}
	}
	void f2()
	{
		System.out.println("Function 2 is working..........");
	}
	public static void main(String[] args) {
		expdemo2 o = new expdemo2();
		o.f1();
		o.f2();
	}
}