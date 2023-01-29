package kinshuk.com.OOPS.Polymorphism;
public class AreaMain {
    public static void main(String[] args) {
        Area ar = new Area();
        double area = ar.calcArea(12.6F);
        System.out.println("Area is "+ area);
        area = ar.calcArea(11.4);
        System.out.println("Area is "+ area);
        System.out.println("Area of Circle is "+ area);
        System.out.println("Area of rectangle is "+ ar.calcArea(4.6,8.4));
        System.out.println("Area of rectangle with name is "+ ar.calcArea(4.6,8.4,"1st str"));
        System.out.println("Area of rectangle with name is "+ ar.calcArea("1st str",4.6,8.4));
        System.out.println("Area of square is "+ ar.calcAreaOfSquare(17));
    }
}
