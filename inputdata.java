import java.io.DataInputStream;
import java.io.IOException;
class inputdata
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream dts = new DataInputStream(System.in);
		
		System.out.print("Enter 1st value : ");
		String s1 = dts.readLine();
		int v1 = Integer.parseInt(s1);

		System.out.print("Enter 2nd value : ");
		String s2 = dts.readLine();
		int v2 = Integer.parseInt(s2);

		System.out.println("Addition : "+(v1 + v2));
	}
}