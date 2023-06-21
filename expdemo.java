import java.util.Scanner;
class expdemo
{
	void f1()
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter num 1 : ");
			int x = s.nextInt();
		
			System.out.print("Enter num 2 : ");
			int y = s.nextInt();
		
			int z = x/y;
			System.out.println("Division = "+z);
		}
		catch(Exception z)
		{
			// System.out.println("An Error Occured.......");
			// System.out.println(z);
			System.out.println("Catch Block -----"+z.getMessage());
		}
		finally
		{
			System.out.println("Finally Block : No impact either exception occur or not");
		}
	}
	void f2()
	{
		System.out.println("Function 2 is working..........");
	}
	public static void main(String[] args) {
		expdemo o = new expdemo();
		o.f1();
		o.f2();
	}
}