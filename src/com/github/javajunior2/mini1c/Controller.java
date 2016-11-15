package com.github.javajunior2.mini1c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Controller {

    Model model;
    View view;
    
    public Controller() {
        this.model = new Model();
        model.listCompany();
        this.view = new View();
        view.drawMenu();
    }
    
    public void readInput() {
        
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
                        model.addEmployee(model.createEmployee());
                        model.listCompany();
                        view.drawMenu();
                        break;
                case 2: System.out.println("Remove employee: input ID.");
                        model.removeEmployee();
                        model.listCompany();
                        view.drawMenu();
                        break;
                case 3: System.out.println("List all employees.");
                        Collections.sort(model.company.employeesList, Employee.ByNameComparator);
                        model.listCompany();
                        view.drawMenu();
                        break;
                case 4: System.out.println("List all employees sorted by surname.");
                        Collections.sort(model.company.employeesList, Employee.BySurnameComparator);
                        model.listCompany();
                        view.drawMenu();
                        break;
                case 5: System.out.println("List all employees sorted by job position.");
                        Collections.sort(model.company.employeesList, Employee.ByJobPositionComparator);
                        model.listCompany();
                        view.drawMenu();
                        break;
                default: System.out.println("Only 0, 1, 2, 3, 4, 5 buttons work.");
                }
            } else {
                System.out.println("Enter valid command number:");
            }
                
        }
        
    }
    
}
