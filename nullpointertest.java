class nullpointertest
{
	void f1()
	{
		System.out.println("Function is working...............");
	}
	public static void main(String[] args)
	{
		nullpointertest o1 = null;
		// o1 = new nullpointertest();
		o1.f1();
	}
}