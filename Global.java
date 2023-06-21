class Global
{
	void BTech()
	{
		System.out.println("Welcome to B.TECH Programme ........");
	}
	void MTech()
	{
		System.out.println("Welcome to M.TECH Programme ........");
	}
	void MBA()
	{
		System.out.println("Welcome to MBA Programme ........");
	}
	public static void main(String args[])
	{
		Global course = new Global();
		course.BTech();
		course.MTech();
		course.MBA();
	}
}