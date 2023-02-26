package kinshuk.com.OOPS.Abstraction;

public class ContractEmployeeTest extends EmployeeTest {
    @Override
    public double calculateSalary(String employmentType){
        double tax = 0.278;
        double grossSalary = 931450;
        double netSalary = 0.00;
        if (employmentType.equalsIgnoreCase("Contractual")){
            netSalary = grossSalary - (grossSalary * tax);
            netSalary = netSalary - 9000; // reduction of 9000 for contractual employee
        }
        return netSalary;
    }
}
