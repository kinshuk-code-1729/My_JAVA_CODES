// Constructor : it has no return type (not void also).
class BGlobal
{
	BGlobal()
	{
		System.out.println("Non Parameterised Constructor........");
	}
	BGlobal(int m)
	{
		System.out.println("Parameterised Constructor........");
	}
	/*void BTech()
	{
		System.out.println("B.TECH Programme ........");
	}
	void MTech()
	{
		System.out.println("M.TECH Programme ........");
	}
	void MBA()
	{
		System.out.println("MBA Programme ........");
	}*/
	public static void main(String args[])
	{
		BGlobal o1 = new BGlobal();
		BGlobal o2 = new BGlobal(65959);		
		//o1.BTech();
		//o1.MTech();
		//o1.MBA();
	}
}