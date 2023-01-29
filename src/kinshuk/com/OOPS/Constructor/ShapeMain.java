package kinshuk.com.OOPS.Constructor;

public class ShapeMain {
    public static void main(String[] args) {
//        Shape s = new Shape();
//        Shape s1 = new Shape(78,"Rhombus");
        Shape s2 = new Shape(89,"Kite",24);
        Shape.InnerShape inshp = s2.new InnerShape();
        inshp.display();
    }
}
