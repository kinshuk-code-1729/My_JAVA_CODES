abstract class RGTU
{
	void BTech()
	{
		System.out.println("BTech from RGPV.....");
	}
	// declaration
	abstract void manager();
	abstract void manager2();
}
class College extends RGTU
{
	// definition OR Overriding
	void manager()
	{
		System.out.println("Manager from RGPV");
	}
	void manager2()
	{
		System.out.println("Manager hu RGPV se ....");
	}
	void Poly()
	{
		System.out.println("Self Course......");
	}
	public static void main(String[] args)
	{
		College k = new College();
		k.BTech();
		k.manager(); // calling
		k.manager2();
	}
}