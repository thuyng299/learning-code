import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<String, Employee> employeeMap = new TreeMap<>();

        Employee emp1 = new Employee("A123", "Andy");
        Employee emp2 = new Employee("A1455", "Joe");
        Employee emp3 = new Employee("A665", "Andy");
        Employee emp4 = new Employee("A657", "Leslie");
        Employee emp5 = new Employee("A657", "Bob");

        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);
        employeeMap.put(emp4.getId(), emp4);
        employeeMap.put(emp5.getId(), emp5);

        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()
        ) {
            System.out.println(entry.getValue());
            System.out.println("--------------------------");
        }

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your wanted id: ");
        String inputId = kb.nextLine();

        Employee foundEmployee = employeeMap.get(inputId);
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
