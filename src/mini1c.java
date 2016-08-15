import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class mini1c {

    public static void main(String[] args) {

        Manager manager = new Manager();
        
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

            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            
            try {
                s = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(mini1c.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            boolean isNumber = Pattern.matches("[0-9]+", s);
            if(isNumber) {
                i = Integer.parseInt(s);
                //System.out.println(i+"\n");
                switch (i) {
                case 0: System.out.println("Exiting.");
                        break;
                case 1: System.out.println("Add employee.");
                        manager.addEmployee(manager.createEmployee());
                        manager.listCompany();
                        break;
                case 2: System.out.println("Remove employee: input ID.");
                        manager.removeEmployee();
                        manager.listCompany();
                        break;
                case 3: System.out.println("List all employees.");
                        manager.listCompany();
                        break;
                case 4: System.out.println("List all employees sorted by name.");
                        Collections.sort(manager.company.employeesList, Employee.ByNameComparator);
                        manager.listCompany();
                        break;
                case 5: System.out.println("List all employees sorted by surname.");
                        Collections.sort(manager.company.employeesList, Employee.BySurnameComparator);
                        manager.listCompany();
                        break;
                default: System.out.println("Only 0, 1, 2, 3, 4, 5 buttons work.");
                }
            } else {
                System.out.println("Enter valid command number:");
            }
                
        }
    }
}