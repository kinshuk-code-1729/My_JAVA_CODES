package kinshuk.com.OOPS.Abstraction;

public class AbstractMain {
    public static void main(String[] args) {
//        Employee emp1 = new Employee();
        PermanentEmployee PEMP = new PermanentEmployee();
        ContractEmployee CEMP = new ContractEmployee();

        String companyName = PEMP.getCompanyName();
        double sal_PEMP = PEMP.calculateSalary("permanent");
        double sal_CEMP = CEMP.calculateSalary("contractual");

        System.out.println("Company name is "+companyName);
        System.out.println("Salary of Permanent Employee is "+ sal_PEMP);
        System.out.println("Salary of Contractual Employee is "+ sal_CEMP);

        Employee e1 = new PermanentEmployee();
        e1.calculateSalary("permanent");

        Employee e2 = new ContractEmployee();
        e2.calculateSalary("contractual");
    }
}
