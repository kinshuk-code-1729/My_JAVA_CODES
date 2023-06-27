package javaapplication1;

import java.util.Date;
public class dateexample 
{
    public static void main(String args[])
    {
            Date dt = new Date();
            System.out.println(dt.getDay());
            // System.out.println(dt);
            if(dt.getDay()==0)
            {
                System.out.println("Sunday");
            }
            else if(dt.getDay()==1)
            {
                System.out.println("Monday");
            }
            else if(dt.getDay()==2)
            {
                System.out.println("Tuesday");
            }
            else if(dt.getDay()==3)
            {
                System.out.println("Wednesday");
            }
            if(dt.getDay()==4)
            {
                System.out.println("Thursday");
            }
            else if(dt.getDay()==5)
            {
                System.out.println("Friday");
            }
            else if(dt.getDay()==6)
            {
                 System.out.println("Saturday");
            }
    
    }
}
/* monday 1
   tuesday 2
   wednesday 3
   thursday 4
   friday 5
   saturday 6
*/