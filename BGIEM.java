// Polymorphism
class BGIEM
{
	void BTech()
	{
		System.out.println("Welcome to B.TECH ECE Programme ........");
	}
	void BTech(int bribe)
	{
		System.out.println("Welcome to B.TECH CSE Programme ........");
	}
	void Btech(int p,String q)
	{
		System.out.println("Welcome to B.TECH ME Programme ........");	
	}
	void Btech(String m,int k)
	{
		System.out.println("Welcome to B.TECH CE Programme ........");	
	}
	public static void main(String args[])
	{
		BGIEM course = new BGIEM();
		course.BTech();	
		course.BTech(5000);
		course.Btech(144,"Engg");
		course.Btech("Engg",144);
	}
}