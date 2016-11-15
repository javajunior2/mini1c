package com.github.javajunior2.mini1c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model {
    
    Company company;
    
    Model() {
        company = new Company();
    }

    
    public Employee createEmployee() {
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
        return tmpEmployee;
    }
    
    public void addEmployee(Employee e1) {
        company.addEmployee(e1);
    }
    
    public void removeEmployee() {
        company.removeEmployee();
    }
    
    public void listCompany() {
        company.listCompany();
    }
    
}
