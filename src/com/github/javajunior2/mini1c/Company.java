package com.github.javajunior2.mini1c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Company{

    List<Employee> employeesList = new ArrayList<Employee>();
    
    Company() {
        //Company company = new Company();
        this.addEmployee(new Employee("Sasha", "Beliy", "admin"));
        this.addEmployee(new Employee("Mike", "Amstel", "developer"));
        this.addEmployee(new Employee("Donald", "Tramp", "director"));
        this.addEmployee(new Employee("Aaron", "Zender", "tester"));
    }

    public void addEmployee(Employee e1) {
        employeesList.add(e1);
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

        if ((ir <= 0) || (ir >= employeesList.size())) {
            System.out.println("Wrong ID.");
        } else {
            employeesList.remove(ir - 1);
        }

    }

    public void listCompany() {
        System.out.println("+---------------------------------------");
        for (int k = 0; k < employeesList.size(); k++) {
            System.out.format("%3s  ", k + 1);
            System.out.println(employeesList.get(k));
	}
        System.out.println("+---------------------------------------");
    }
    
}