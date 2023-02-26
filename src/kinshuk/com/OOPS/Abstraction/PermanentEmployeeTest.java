package kinshuk.com.OOPS.Abstraction;

public class PermanentEmployeeTest extends EmployeeTest {
    @Override
    public double calculateSalary(String employmentType){
        double tax = 0.18;
        double grossSalary = 780455;
        double netSalary = 0.0;
        if(employmentType.equalsIgnoreCase("Permanent")){
            netSalary = grossSalary - (grossSalary * tax);
            netSalary = netSalary + 13000; // for permanent employee a hike of 13000
        }
        return netSalary;
    }
}
