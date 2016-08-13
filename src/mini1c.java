import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class mini1c {

    public static void main(String[] args) {

        Company com = new Company();
        int i = 3;
        com.addEmployee(new Employee("Sasha", "Beliy", "admin"));
        com.addEmployee(new Employee("Aaron", "Zender", "tester"));
        com.addEmployee(new Employee("Mike", "Amstel", "developer"));

        System.out.println("------------------------------");
        System.out.println("0 - Exit");
        System.out.println("1 - Add employee");
        System.out.println("2 - Remove employee");
        System.out.println("3 - List employees");
        System.out.println("4 - List employees (sort by name)");
        System.out.println("5 - List employees (sort by surname)");
        System.out.println("Enter command number:");
        System.out.println("------------------------------");

        while (i != 0) {
            String s = null;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                    s = br.readLine();
            } catch (IOException e) {
                    e.printStackTrace();
            }

            i = Integer.parseInt(s);

            switch (i) {
            case 0: System.out.println("Exiting.");
                            break;
            case 1: System.out.println("Add employee.");
                    com.addEmployee();
                    com.listCompany();
                    break;
            case 2:	System.out.println("Remove employee: input ID.");
                    com.removeEmployee();
                    com.listCompany();
                    break;
            case 3: System.out.println("List all employees.");
                    com.listCompany();
                    break;
            case 4: System.out.println("List all employees sorted by name.");
                    Collections.sort(com.comp, Employee.ByNameComparator);
                    com.listCompany();
                    break;
            case 5: System.out.println("List all employees sorted by surname.");
                    Collections.sort(com.comp, Employee.BySurnameComparator);
                    com.listCompany();
                    break;
            default: System.out.println("Only 0, 1, 2, 3, 4, 5 buttons work.");
            }
        }
    }
}