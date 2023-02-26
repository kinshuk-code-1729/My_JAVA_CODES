package kinshuk.com.Generics_and_Collection_Framework.Map;
import kinshuk.com.Generics_and_Collection_Framework.List.Emp;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class MapTest2 {
    public static void main(String[] args) {
        Map<Long, Emp> mapOfEmployee = new HashMap<>();
        Map<Long, List<Emp>> mapOfEmployeeList = new HashMap<>();
        Map<Long, Map<String, Emp>> mapOfMapEmployee = new HashMap<>();

        Emp emp = new Emp();
        emp.setEmpID(111L);
        emp.setEmpName("Kinshuk");
        mapOfEmployee.put(emp.getEmpID(), emp);

        emp = new Emp();
        emp.setEmpID(222L);
        emp.setEmpName("John");
        mapOfEmployee.put(emp.getEmpID(), emp);

        Emp resultEmp = mapOfEmployee.get(111L);
        System.out.println(resultEmp.getEmpName());

        for(Map.Entry<Long, Emp> m: mapOfEmployee.entrySet()){
            System.out.println("Emp ID is : "+m.getKey()+ " Emp Name is : "+m.getValue().getEmpName());
            System.out.printf("Emp ID is : %d Emp Name is : %s",m.getKey() ,m.getValue().getEmpName());
            System.out.println();
        }
    }
}
