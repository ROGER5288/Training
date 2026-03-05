package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    // DAOs for database operations
    private static DepartmentDAO deptDAO;
    private static EmployeeDAO empDAO;
    private static Scanner scanner;
    private static boolean running = true;

    public static void main(String[] args) {
        // Initialize DAOs and Scanner
        deptDAO = new DepartmentDAO();
        empDAO = new EmployeeDAO();
        scanner = new Scanner(System.in);

        System.out.println("========== Welcome to Employee Management System ==========\n");

        // Main menu loop
        while (running) {
            displayMainMenu();
            int choice = getIntInput("Choose an option: ");
            handleMainMenuChoice(choice);
        }

        // Cleanup resources
        empDAO.close();
        deptDAO.close();
        scanner.close();
        System.out.println("========== Application Closed Successfully ==========");
    }

    // Display main menu options
    private static void displayMainMenu() {
        System.out.println("\n========== MAIN MENU ==========");
        System.out.println("1. Department Management");
        System.out.println("2. Employee Management");
        System.out.println("3. View All Employees");
        System.out.println("4. View All Departments");
        System.out.println("5. Exit");
        System.out.println("========== ===========");
    }

    // Handle main menu choice
    private static void handleMainMenuChoice(int choice) {
        switch (choice) {
            case 1:
                departmentMenu();
                break;
            case 2:
                employeeMenu();
                break;
            case 3:
                viewAllEmployees();
                break;
            case 4:
                viewAllDepartments();
                break;
            case 5:
                running = false;
                System.out.println("\nThank you for using Employee Management System!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    // Department Management Submenu
    private static void departmentMenu() {
        boolean inDeptMenu = true;
        while (inDeptMenu) {
            System.out.println("\n========== DEPARTMENT MENU ==========");
            System.out.println("1. Add Department");
            System.out.println("2. View Department by ID");
            System.out.println("3. Update Department");
            System.out.println("4. Delete Department");
            System.out.println("5. Back to Main Menu");
            System.out.println("========== ===========");

            int choice = getIntInput("Choose an option: ");
            switch (choice) {
                case 1:
                    addDepartment();
                    break;
                case 2:
                    viewDepartmentById();
                    break;
                case 3:
                    updateDepartment();
                    break;
                case 4:
                    deleteDepartment();
                    break;
                case 5:
                    inDeptMenu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Employee Management Submenu
    private static void employeeMenu() {
        boolean inEmpMenu = true;
        while (inEmpMenu) {
            System.out.println("\n========== EMPLOYEE MENU ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Back to Main Menu");
            System.out.println("========== ===========");

            int choice = getIntInput("Choose an option: ");
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployeeById();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    inEmpMenu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // ========== DEPARTMENT OPERATIONS ==========

    private static void addDepartment() {
        System.out.println("\n========== Add Department ==========");
        String name = getStringInput("Enter Department Name: ");
        String location = getStringInput("Enter Location: ");

        Department dept = new Department(name, location);
        DepartmentDTO result = deptDAO.create(dept);

        if (result != null) {
            System.out.println("✓ Department added successfully!");
            System.out.println(result);
        } else {
            System.out.println("✗ Failed to add department.");
        }
    }

    private static void viewDepartmentById() {
        System.out.println("\n========== View Department ==========");
        long id = getLongInput("Enter Department ID: ");
        DepartmentDTO dept = deptDAO.read(id);

        if (dept != null) {
            System.out.println(dept);
        } else {
            System.out.println("✗ Department not found.");
        }
    }

    private static void updateDepartment() {
        System.out.println("\n========== Update Department ==========");
        long id = getLongInput("Enter Department ID: ");
        String name = getStringInput("Enter New Department Name: ");
        String location = getStringInput("Enter New Location: ");

        DepartmentDTO result = deptDAO.update(id, name, location);

        if (result != null) {
            System.out.println("✓ Department updated successfully!");
            System.out.println(result);
        } else {
            System.out.println("✗ Department not found or update failed.");
        }
    }

    private static void deleteDepartment() {
        System.out.println("\n========== Delete Department ==========");
        long id = getLongInput("Enter Department ID: ");

        if (deptDAO.delete(id)) {
            System.out.println("✓ Department deleted successfully!");
        } else {
            System.out.println("✗ Department not found or deletion failed.");
        }
    }

    // ========== EMPLOYEE OPERATIONS ==========

    private static void addEmployee() {
        System.out.println("\n========== Add Employee ==========");

        // Get employee details
        String name = getStringInput("Enter Employee Name: ");
        String email = getStringInput("Enter Email: ");
        double salary = getDoubleInput("Enter Salary Amount: ");
        String currency = getStringInput("Enter Currency (USD/INR/etc): ");

        // Display available departments
        List<DepartmentDTO> departments = deptDAO.findAll();
        if (departments.isEmpty()) {
            System.out.println("✗ No departments available. Please add a department first.");
            return;
        }

        System.out.println("\nAvailable Departments:");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println((i + 1) + ". " + departments.get(i));
        }

        int deptChoice = getIntInput("Select Department (enter number): ");
        if (deptChoice < 1 || deptChoice > departments.size()) {
            System.out.println("✗ Invalid department selection.");
            return;
        }

        // Get selected department ID
        DepartmentDTO selectedDept = departments.get(deptChoice - 1);
        Department dept = new Department();
        dept.setId(selectedDept.getId());

        // Create and save employee
        Employee emp = new Employee(name, email, salary, currency);
        emp.setDepartment(dept);
        EmployeeDTO result = empDAO.create(emp);

        if (result != null) {
            System.out.println("✓ Employee added successfully!");
            System.out.println(result);
        } else {
            System.out.println("✗ Failed to add employee.");
        }
    }

    private static void viewEmployeeById() {
        System.out.println("\n========== View Employee ==========");
        long id = getLongInput("Enter Employee ID: ");
        EmployeeDTO emp = empDAO.read(id);

        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("✗ Employee not found.");
        }
    }

    private static void updateEmployee() {
        System.out.println("\n========== Update Employee ==========");
        long id = getLongInput("Enter Employee ID: ");
        String name = getStringInput("Enter New Name: ");
        String email = getStringInput("Enter New Email: ");
        double salary = getDoubleInput("Enter New Salary Amount: ");
        String currency = getStringInput("Enter Currency (USD/INR/etc): ");

        EmployeeDTO result = empDAO.update(id, name, email, salary, currency);

        if (result != null) {
            System.out.println("✓ Employee updated successfully!");
            System.out.println(result);
        } else {
            System.out.println("✗ Employee not found or update failed.");
        }
    }

    private static void deleteEmployee() {
        System.out.println("\n========== Delete Employee ==========");
        long id = getLongInput("Enter Employee ID: ");

        if (empDAO.delete(id)) {
            System.out.println("✓ Employee deleted successfully!");
        } else {
            System.out.println("✗ Employee not found or deletion failed.");
        }
    }

    // ========== VIEW ALL OPERATIONS ==========

    private static void viewAllEmployees() {
        System.out.println("\n========== All Employees ==========");
        List<EmployeeDTO> employees = empDAO.findAll();

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println(String.format("%-5s %-20s %-30s %-20s %-10s %-10s",
                    "ID", "Name", "Email", "Department", "Salary", "Currency"));
            System.out.println("==========================================================================================");

            for (EmployeeDTO emp : employees) {
                System.out.println(String.format("%-5d %-20s %-30s %-20s %-10.2f %-10s",
                        emp.getId(),
                        emp.getName(),
                        emp.getEmail(),
                        emp.getDepartmentName(),
                        emp.getSalaryAmount(),
                        emp.getCurrency()));
            }
        }
    }

    private static void viewAllDepartments() {
        System.out.println("\n========== All Departments ==========");
        List<DepartmentDTO> departments = deptDAO.findAll();

        if (departments.isEmpty()) {
            System.out.println("No departments found.");
        } else {
            System.out.println(String.format("%-5s %-25s %-20s %-12s",
                    "ID", "Department Name", "Location", "Emp Count"));
            System.out.println("===================================================================");

            for (DepartmentDTO dept : departments) {
                System.out.println(String.format("%-5d %-25s %-20s %-12d",
                        dept.getId(),
                        dept.getDeptName(),
                        dept.getLocation(),
                        dept.getEmployeeCount()));
            }
        }
    }

    // ========== INPUT HELPER METHODS ==========

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        try {
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            return value;
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            return -1;
        }
    }

    private static long getLongInput(String prompt) {
        System.out.print(prompt);
        try {
            long value = scanner.nextLong();
            scanner.nextLine(); // Consume newline
            return value;
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            return -1;
        }
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        try {
            double value = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            return value;
        } catch (Exception e) {
            scanner.nextLine(); // Clear invalid input
            return -1.0;
        }
    }
}

