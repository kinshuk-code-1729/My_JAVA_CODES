import java.io.*;
class writefile
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("F:\\Batch2\\Kinshuk.txt");
		FileOutputStream fos = new FileOutputStream(f1);

		String s = "Hello mitron !!!, Kinshuk ka Namaskaar........";
		byte S[] = s.getBytes();
		for(int k = 0;k < S.length;k++)
		{
			fos.write(S[k]);
		}
		System.out.println("Content Added Successfully !!!!!!");
	}
}