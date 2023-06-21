class foreachloop
{
	public static void main(String args[])
	{
		int sum = 0;
		for(String m:args) //for each
		{
			//System.out.println(m);
			sum += Integer.parseInt(m);
		}
		System.out.println("Sum of Array = "+sum);
	}
}