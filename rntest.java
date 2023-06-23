class xyz
{
	void f()
	{
		System.out.println("Function is working..........");
	}
}
class rntest extends xyz implements Runnable
{
	public void run()
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		rntest rn = new rntest();
		Thread tr = new Thread(rn);
		tr.start(); 
	}
}