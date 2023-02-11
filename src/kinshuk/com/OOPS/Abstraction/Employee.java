package kinshuk.com.OOPS.Abstraction;

public abstract class Employee {
    private String companyName = "KB Corp. Ltd.";

    public String getCompanyName() {
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);
}
