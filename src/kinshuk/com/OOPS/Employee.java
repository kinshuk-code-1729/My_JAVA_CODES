package kinshuk.com.OOPS;

public class Employee {
    long EmployeeID; // state variable
    double salary; // state variable

    // Behaviours
    void setEmployeeID(long eid){
        EmployeeID = eid;
    }
    void setSalary(double s){
        salary = s ;
    }
    long getEmployeeID() {
        return EmployeeID;
    }
    double getsalary(){
        return salary;
    }

    // Example to show how to override 'toString()' method in Java.
    @Override
    public String toString(){
        String s = "Emp Id = "+ EmployeeID + " Salary = " + salary;
        return s;
    }
}
