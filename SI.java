import java.io.*;
class SI
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream dts = new DataInputStream(System.in);
		
		System.out.println("Enter principal amount........");
		String s1 = dts.readLine();
		double p = Double.parseDouble(s1);

		System.out.println("Enter rate of interest.........");
		String s2 = dts.readLine();
		float r = Float.parseFloat(s2);

		System.out.println("Enter time in years.........");
		String s3 = dts.readLine();
		int t = Integer.parseInt(s3);

		double it = (p*r*t)/100;
		System.out.println("Simple Interest  = "+ it);
	}
}