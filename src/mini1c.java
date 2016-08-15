import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class mini1c {

    public static void main(String[] args) {

        Manager man = new Manager();
        
        System.out.println("------------------------------");
        System.out.println("0 - Exit");
        System.out.println("1 - Add employee");
        System.out.println("2 - Remove employee");
        System.out.println("3 - List employees");
        System.out.println("4 - List employees (sort by name)");
        System.out.println("5 - List employees (sort by surname)");
        System.out.println("Enter command number:");
        System.out.println("------------------------------");

        int i = 3;
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
                    man.addEmployee(man.createEmployee());
                    man.listCompany();
                    break;
            case 2: System.out.println("Remove employee: input ID.");
                    man.removeEmployee();
                    man.listCompany();
                    break;
            case 3: System.out.println("List all employees.");
                    man.listCompany();
                    break;
            case 4: System.out.println("List all employees sorted by name.");
                    Collections.sort(man.company.comp, Employee.ByNameComparator);
                    man.listCompany();
                    break;
            case 5: System.out.println("List all employees sorted by surname.");
                    Collections.sort(man.company.comp, Employee.BySurnameComparator);
                    man.listCompany();
                    break;
            default: System.out.println("Only 0, 1, 2, 3, 4, 5 buttons work.");
            }
        }
    }
}