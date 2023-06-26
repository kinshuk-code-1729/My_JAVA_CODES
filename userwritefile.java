import java.io.*;
class userwritefile
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("F:\\Batch2\\Banerjee.txt");
		FileOutputStream fos = new FileOutputStream(f1);

		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Enter Some Data ..............");
		String s = ds.readLine();
		byte S[] = s.getBytes();
		for(int k = 0;k < S.length;k++)
		{
			fos.write(S[k]);
		}
		System.out.println("Content Added Successfully !!!!!!");
	}
}