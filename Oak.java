class SunMicroSystems   // Base Class or Parent Class or Super Class
{
	void Java()
	{
		System.out.println("Hi from Java Programming");
	}
	final void cLang()
	{
		System.out.println("C Language by SM");
	}
}

class Oak extends SunMicroSystems // Derived Class or Child Class or Sub Class
{
	void DBMS()
	{
		System.out.println("Hello from SQL...................");
	}
	// override
	void cLang(int k)
	{
		System.out.println("C Language by Oracle");
	}
	public static void main(String args[])
	{
		Oak pg = new Oak();
		pg.Java();
		pg.cLang();
		pg.cLang(457);
	}
}