interface RGPV
{
	abstract void BTech();
}
interface SMIT
{
	public void MTech();
	abstract void MBA();
}

class Clg implements RGPV,SMIT
{
	public void BTech()
	{
		System.out.println("BTECH Programme......");
	}
	public void MTech()
	{
		System.out.println("MTECH Programme......");
	}
	public void MBA()
	{
		System.out.println("MBA Programme......");
	}
	public static void main(String[] args)
	{
		Clg k = new Clg();
		k.BTech();
		k.MTech();
		k.MBA();
	}
}