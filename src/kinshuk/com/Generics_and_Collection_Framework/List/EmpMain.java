package kinshuk.com.Generics_and_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {
        ArrayList<Emp> empList =  new ArrayList<>();
        List<Emp> empList2 =  new ArrayList<>(); // dynamic polymorphism

        Emp emp = new Emp();
        emp.setEmpID(167L);
        emp.setEmpName("Ravi");
        empList2.add(emp);

        emp = new Emp();
        emp.setEmpID(255L);
        emp.setEmpName("King");
        empList2.add(emp);

        for(Emp e: empList2){
            System.out.println("Employee with ID\t"+e.getEmpID()+" is "+e.getEmpName());
        }
    }
}
