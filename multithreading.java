class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for (int i=1;i<=15 ;i++ ) {
				System.out.println("Rajesh "+i);
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for (int j=70;j<=110 ;j=j+2) {
				System.out.println(j+"...........Deepu");
				sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class multithreading
{
	public static void main(String[] args)
	{
		thread1 t1 = new thread1();
		thread2 t2 = new thread2();
		t1.start();
		t2.start();
	}
}