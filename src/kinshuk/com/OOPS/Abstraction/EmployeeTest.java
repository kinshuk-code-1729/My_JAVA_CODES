package kinshuk.com.OOPS.Abstraction;

public abstract class EmployeeTest {
    private String companyName = "KB Corp. Ltd.";

    public String getCompanyName() {
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);
}
