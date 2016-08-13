import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Company{

    ArrayList<Employee> comp = new ArrayList<Employee>();

    public void addEmployee() {

        String n = null;
        String s = null;
        String j = null;

        System.out.print("Input name.");
        BufferedReader brn = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = brn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Input surname.");
        BufferedReader brs = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = brs.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Input job position.");
        BufferedReader brj = new BufferedReader(new InputStreamReader(System.in));
        try {
            j = brj.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Employee tmpEmployee = new Employee(n, s, j);
        comp.add(tmpEmployee);
    }

    public void addEmployee(Employee e1) {
        comp.add(e1);
    }

    public void removeEmployee() {

        int ir = 0;
        String s = null;

        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = brr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ir = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        if (ir == 0) {
            System.out.print("Wrong ID.");
        } else {
            comp.remove(ir - 1);
        }
    }

    public void listCompany() {
        System.out.println("+------------------------");
        for (int k = 0; k < comp.size(); k++) {
            System.out.format("%3s  ", k + 1);
            System.out.println(comp.get(k));
	}
        System.out.println("+------------------------");
    }
}