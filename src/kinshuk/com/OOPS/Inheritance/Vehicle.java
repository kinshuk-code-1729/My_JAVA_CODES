package kinshuk.com.OOPS.Inheritance;

public class Vehicle {
    private String vehicleType;
    final long regNo = 0;
    public Vehicle(){
        System.out.println("Default constructor of base class vehicle");
    }
    public Vehicle(String s){
        System.out.println("1 parameterised constructor...");
        System.out.println(s);
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleType(String s){
        this.vehicleType = vehicleType;
    }
    public void show(){
        System.out.println("I am Base Class Vehicle");
    }
}
