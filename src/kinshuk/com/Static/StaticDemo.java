package kinshuk.com.Static;

public class StaticDemo {

//    static variables
    static int x = 145;
    static int y;
    int EID = 548;
    static{
        System.out.println("Initialised static block");
        y = x * 8;
    }
    {
        y = x * 6;
    }
//    y = x * 4; not allowed in class to write directly
    {
    System.out.println("I am a non static block");
    }
    public StaticDemo(){
        System.out.println("Called here the default constructor...");
    }
    static void k1()
    {
        System.out.println("Inside k1 static block");
    }

    public void show()
    {
        //static members are allowed to be accessed within static context
        //static members are allowed to be accessed inside a non static method/context
        System.out.println("Value of x = "+this.x);//We can access static inside non static
        System.out.println("Value of Emp ID = "+this.EID);
    }

    public static void display()
    {
        //System.out.println("Value of a is: "+this.a);//'com.mycompany.staticdemo.StaticPractice.this' cannot be referenced from a static context
        //object creation happens later, first static block gets executed
        //this operator cannot be used inside static context
        //System.out.println("Value of Employee ID is: "+this.empId);
        System.out.println("Value of x = "+x);
        //System.out.println("Value of Employee ID = "+EID);//Non-static field 'empId' cannot be referenced from a static context
    }

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
        //Creating an object of StaticPractice Class
        StaticDemo stat1 = new StaticDemo();
        stat1.x = 65;//Class Level static variable a is getting modified by sp1 which means from now  on all objects will see the modified value
        stat1.EID = 558;
        StaticDemo stat2 = new StaticDemo();
        System.out.println("Value of stat2.x = "+stat2.x);
        System.out.println(StaticDemo.x);//Static members can be also called without object, they can be called directly only with the Class Name and then dot.
        StaticDemo.display();
        display();
        System.out.println("Value of sp2.empId is "+stat2.EID);
    }
}