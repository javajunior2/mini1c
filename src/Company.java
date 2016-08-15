import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Company{

    List<Employee> comp = new ArrayList<Employee>();

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