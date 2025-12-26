package com.anurag.employee_management_system;

import java.util.*;

public class EmployeeManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        service.addEmployee(new Employee(id, name, dept, salary));
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to update: ");
                        id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter New Department: ");
                        dept = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        salary = sc.nextDouble();

                        service.updateEmployee(id, name, dept, salary);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to delete: ");
                        id = sc.nextInt();
                        service.deleteEmployee(id);
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to search: ");
                        id = sc.nextInt();
                        service.searchEmployee(id);
                        break;

                    case 5:
                        service.viewAllEmployees();
                        break;

                    case 6:
                        System.out.println("Exiting application...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine(); // clear buffer
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }
}
