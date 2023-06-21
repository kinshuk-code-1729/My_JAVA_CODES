interface stexample
{
	static void func()
	{
		System.out.println("Static Function in interface");
	}
}
class mydemo implements stexample
{
	public static void main(String args[])
	{
		stexample.func();
	}
}