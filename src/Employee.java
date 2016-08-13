import java.util.Comparator;

public class Employee {

    private String name;
    private String surname;
    private String jobPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    Employee(String name, String surname, String jobPosition) {
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
    }

    @Override
    public String toString() {
        return String.format("%-12s %-12s %-12s", this.name, this.surname, this.jobPosition);
        //return "\t" + this.name + "\t" + this.surname + "\t" + this.jobPosition;
    }

    /*Comparator for sorting the list by Employee Name*/
    public static Comparator<Employee> ByNameComparator = new Comparator<Employee>() {
        public int compare(Employee s1, Employee s2) {
            String employeeName1 = s1.getName().toUpperCase();
            String employeeName2 = s2.getName().toUpperCase();
            return employeeName1.compareTo(employeeName2);//ascending order
    }
    };

    public static Comparator<Employee> BySurnameComparator = new Comparator<Employee>() {
        public int compare(Employee s1, Employee s2) {
            String employeeName1 = s1.getSurname().toUpperCase();
            String employeeName2 = s2.getSurname().toUpperCase();
            return employeeName1.compareTo(employeeName2);//ascending order
        }
    };
}