package com.employeeApp;

import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no:");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter lastname:");
        String lastname = scanner.nextLine();

        System.out.println("Enter experience:");
        double experience = scanner.nextDouble();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee employee = new Employee(no, name, lastname, experience, salary);

        System.out.println("1 Show Info");
        System.out.println("2 Raise Salary");
        System.out.println("3 Format PC");

        int process = scanner.nextInt();
        scanner.nextLine();

        switch (process) {

            case 1:
                employee.showEmployee();
                break;

            case 2:
                System.out.println("Raise amount:");
                double raise = scanner.nextDouble();
                employee.raiseValue(raise);
                break;

            case 3:
                System.out.println("Who's formatting?");
                String who = scanner.nextLine();

                System.out.println("Which OS?");
                String os = scanner.nextLine();

                employee.format(os, who);
                break;

            default:
                System.out.println("Wrong choice");
        }

    }
}