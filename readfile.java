import java.io.*;
class readfile
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("F:\\Batch2\\Test.txt");
		FileInputStream fs = new FileInputStream(f1);

		int char_count = fs.available();
		for(int j = 1;j <= char_count;j++)
		{
			System.out.print((char)fs.read());
		}
	}
}