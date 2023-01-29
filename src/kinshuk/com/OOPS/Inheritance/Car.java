package kinshuk.com.OOPS.Inheritance;

public class Car extends Vehicle{
    public long buildNumber;
    public Car(){super("Kinshuk");
        System.out.println("default constructor in sub class car");
        super.setVehicleType("Car is a 4 wheeler");
    }
    public Car(long buildNumber){
        this();
        this.buildNumber = buildNumber;
    }
    public Car(String k,long kb){
        this(91L);
    }
    public void showDetails(){
        System.out.println(getVehicleType());
        System.out.println("Build number of car is "+ this.buildNumber);
    }
    @Override
    public void show() {
        System.out.println("I am a sub class car");
    }
}
