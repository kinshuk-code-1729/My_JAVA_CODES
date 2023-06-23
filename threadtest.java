class threadtest extends Thread
{
	public void run()
	{
		try
		{
			for (int i=11;i<=20 ;i++ )
			{
				// System.out.println(i);
				System.out.print(getName());
				sleep(500);
				/*if(i == 15)
				{
					stop();
				}*/
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		threadtest o1 = new threadtest();
		o1.setName("Lucknow ");
		o1.start();
	}
}