class arraydemo
{
	public static void main(String args[])
	{
		int arr[] = {25,47,69,77,36,24,36};

		/*arr[0] = 18;
		arr[1] = 64;
		arr[2] = 37;
		arr[3] = 93;
		arr[4] = 71;*/

		/*for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}*/
		int s = 0;
		for(int v : arr)
		{
			System.out.print(v+"\t");
			s += v;
		}
		System.out.println("\nSum = "+s);		
	}
}