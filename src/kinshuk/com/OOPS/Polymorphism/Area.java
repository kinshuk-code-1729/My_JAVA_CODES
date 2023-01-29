package kinshuk.com.OOPS.Polymorphism;
import java.lang.Math;
public class Area {
    public double calcArea(double r){
        return (Math.PI * r * r);
    }
    public double calcArea(double l,double w){
        return (l * w);
    }
    public double calcArea(double l,double w,String s){
        System.out.println(s);
        return (l * w);
    }
    public double calcArea(String s,double l,double w){
        System.out.println(s);
        return (l * w);
    }
    public int calcArea(int l){
        return (l * l);
    }
    public double calcAreaOfSquare(long l){
        return (l * l);
    }
    public double calcAreaOfRectangle(double l,double w){
        return (l * w);
    }
}
