class Sharda
{
	Sharda()
	{
		System.out.println("Non Parameterised Constructor : Sharda -- BASE");
	}
	Sharda(int x)
	{
		System.out.println("Parameterised Constructor : Sharda -- BASE");
	}
}
class Manipal extends Sharda
{
	Manipal()
	{
		System.out.println("Non Paramterised Constructor : Manipal -- DERIVED");
	}
	Manipal(int y)
	{
		super(y);
		System.out.println("Paramterised Constructor : Manipal -- DERIVED");
	}
	public static void main(String args[])
	{
		Manipal smit = new Manipal(7888);
	}
}