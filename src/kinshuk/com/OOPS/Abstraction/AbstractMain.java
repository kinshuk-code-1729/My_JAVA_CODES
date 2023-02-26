package kinshuk.com.OOPS.Abstraction;

public class AbstractMain {
    public static void main(String[] args) {
//        Employee emp1 = new Employee();
        PermanentEmployeeTest PEMP = new PermanentEmployeeTest();
        ContractEmployeeTest CEMP = new ContractEmployeeTest();

        String companyName = PEMP.getCompanyName();
        double sal_PEMP = PEMP.calculateSalary("permanent");
        double sal_CEMP = CEMP.calculateSalary("contractual");

        System.out.println("Company name is "+companyName);
        System.out.println("Salary of Permanent Employee is "+ sal_PEMP);
        System.out.println("Salary of Contractual Employee is "+ sal_CEMP);

        EmployeeTest e1 = new PermanentEmployeeTest();
        e1.calculateSalary("permanent");

        EmployeeTest e2 = new ContractEmployeeTest();
        e2.calculateSalary("contractual");
    }
}
