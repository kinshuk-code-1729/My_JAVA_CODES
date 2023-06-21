class cmddemo
{
	public static void main(String args[])
	{
		int s = args.length; // length : predefined variable finds size of array
		System.out.println("Size of Array : "+s);

		int sum = 0;
		for(int i=0;i<s;i++)
		{
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Sum of Array : "+sum);
	}
}