class SunMicroSystems   // Base Class or Parent Class or Super Class
{
	void Java()
	{
		System.out.println("Hi from Java Programming");
	}
}

class Meta extends SunMicroSystems
{
	void ReactJS()
	{
		System.out.println("JS Library for front end development");
	}
}
class Oracle extends Meta // Derived Class or Child Class or Sub Class
{
	void DBMS()
	{
		System.out.println("Hello from SQL...................");
	}
	public static void main(String args[])
	{
		Oracle pg = new Oracle();
		pg.Java();
		pg.DBMS();
		pg.ReactJS();
	}
}