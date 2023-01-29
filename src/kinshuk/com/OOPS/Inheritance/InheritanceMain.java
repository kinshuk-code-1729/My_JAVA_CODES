package kinshuk.com.OOPS.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.display();
        Car c1 = new Car();
        c1.showDetails();

        System.out.println("----------------------------");
        Vehicle v1 = new Vehicle();
        v1.show();

        v1 = new Bike();
        v1.show();

        v1 = new Car();
        v1.show();
    }
}
