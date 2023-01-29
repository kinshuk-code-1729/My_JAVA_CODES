package kinshuk.com.OOPS.Constructor;

public class Shape {
    int length;
    int breadth;
    String shapetype; // default value is null

    // default constructor
    public Shape(){
        System.out.println("default constructor....");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapetype);
    }

    // Overloaded constructor 1

    public Shape(int length,String shapetype){
        this.length = length;
        this.shapetype = shapetype;
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapetype);
        System.out.println("two parameterised overloaded constructors");
    }

    // Overloaded constructor 1
    public Shape(int length,String shapetype,int breadth){
        this.length = length;
        this.breadth = breadth;
        this.shapetype = shapetype;
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapetype);
        System.out.println("three parameterised overloaded constructors");
        this.test();
    }
    public void test(){
        System.out.println("Hello I am a test method...");
    }

    class InnerShape {
        int inr_val = 48486;
        void display(){
            System.out.println("Inner Class......");
            System.out.println(inr_val);
        }
    }
}
