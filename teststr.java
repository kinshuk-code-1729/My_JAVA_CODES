class teststr
{
	void f()
	{
		// String s1 = "I Am DOiNg JAVA CoDINg iN ColLEgE ";
		// String s2 = "    Baderia Global    ";
		// String s3 = "IIT-BHU";
		// System.out.println(s2);
		// String r1 = s1.toUpperCase();
		// String r1 = s1.toLowerCase();
		// String r1 = s1.replace('A','u');
		// String r1 = s1.replace("JAVA","PyThoN");
		// System.out.println(s2.length());
		// String r2 = s2.trim();
		// String r3 = s1.concat(r2);
		// System.out.println(r3);
		// System.out.println(r2);
		// System.out.println(r2.length());
		// char ch = s3.charAt(2);
		// int ix = s3.indexOf('H');
		// System.out.println(ch);
		// System.out.println(ix);
		String str1 = "Global College";
		String str2 = "GLOBAL College";
		// String mystr = mystr.substring(3);
		// System.out.println(mystr);
		System.out.println(str1);
		System.out.println("\n-------------------------------\n");
		// boolean r1 = str1.equals(str2);
		// boolean r2 = str1.equalsIgnoreCase(str2);
		// System.out.println(r1);
		// System.out.println(r2);
		int rs = str1.compareTo(str2);
		if(rs == 0)
		{
			System.out.println("Matched......"+rs);
		}
		else
		{
			System.out.println("Not Matched......"+rs);
		}
	}
	public static void main(String[] args)
	{
		teststr t1 = new teststr();
		t1.f();	
	}
}