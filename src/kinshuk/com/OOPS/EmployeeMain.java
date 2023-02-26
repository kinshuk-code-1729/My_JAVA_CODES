package kinshuk.com.OOPS;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeDemo king = new EmployeeDemo();
        System.out.println(king.getEmployeeID());
        System.out.println(king.getsalary());

        System.out.println("******After setting values of state variables....");
        king.setEmployeeID(145L);
        king.setSalary(4783.89);

        System.out.println(king.getEmployeeID());
        System.out.println(king.getsalary());

        System.out.println("***New Object for shit***");
        EmployeeDemo shit = new EmployeeDemo();
        System.out.println(shit.getEmployeeID());
        System.out.println(shit.getsalary());

        System.out.println("******After setting values of state variables....");
        shit.setEmployeeID(784L);
        shit.setSalary(7834.12);

        System.out.println(shit.getEmployeeID());
        System.out.println(shit.getsalary());

        System.out.println(shit);
    }
}
