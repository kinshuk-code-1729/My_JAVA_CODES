class newthread extends Thread
{
	public void run()
	{
		try
		{
			String PL[] = {"C++","Java","Ruby","Python","Dart","Kotlin","JavaScript"};
			for (int i=0;i<PL.length ;i++ )
			{
				System.out.print(" "+PL[i]);
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		newthread o1 = new newthread();
		o1.start();
	}
}