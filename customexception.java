import java.util.Scanner;
class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("You are less than 18.......");
	}
}

class customexception
{
	void myfunc()
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Your Age : ");
			int age = s.nextInt();

			if (age >= 18)
			{
				System.out.println("Vote Done Successfully......");
			}
			else
			{
				throw new AgeException();
			}
		}
		catch(AgeException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Ready for the next voter to come.........");
		}
	}
	public static void main(String[] args)
	{
		customexception co = new customexception();
		co.myfunc();
	}
}