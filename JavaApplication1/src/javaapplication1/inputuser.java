package javaapplication1;
import java.util.*;
public class inputuser 
{
    void f1()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter principle amount : ");
        String s1 = s.next();
        double p = Double.parseDouble(s1);

        System.out.print("Enter rate of interest : ");
        String s2 = s.next();
        float r = Float.parseFloat(s2);

        System.out.print("Enter time : ");
        String s3 = s.next();
        int t = Integer.parseInt(s3);

        double it = (p*r*t)/100;
        System.out.println("Simple Interest : "+it);
      }
    public static void main(String args[])
    {
        inputuser o1 = new inputuser();
        o1.f1();
    }
}
