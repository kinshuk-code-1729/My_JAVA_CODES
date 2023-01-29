package kinshuk.com.OOPS.Inheritance;

public class Bike extends Vehicle{
    public Bike(){
        super("Kinshuk");
        System.out.println("default constructor in sub class bike");
        super.setVehicleType("Bike is a two wheeler");
    }
    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println(super.regNo);
    }

    @Override
    public void show() {
        System.out.println("I am a sub class bike");
    }
}
