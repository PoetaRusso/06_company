package telran.employee;

import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.WageEmployee;

public class EqualsAppl {
    public static void main(String[] args) {
        Employee empl1 = new Manager(1000, "John", "Smith", 182, 20_000, 20);
        Employee empl2 = new Manager(1000, "John", "Smith", 182, 20_000, 20);
        boolean check = empl1.equals(empl2);
        System.out.println(check);
        empl1.setFirstName("Johny");
        System.out.println(empl1);
        System.out.println(empl2);
        if (empl1 instanceof Manager manager1) {
//            Manager manager1 = (Manager) empl1;
            System.out.println(manager1.getBaseSalary());
        }
        System.out.println("=== Equals of String ===");
        String str1 = "Hello";
        String str2 = "Hello";
        check = str1.equals(str2);
        System.out.println(check);
    }
}
