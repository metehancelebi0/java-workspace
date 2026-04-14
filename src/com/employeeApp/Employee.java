package com.employeeApp;

public class Employee {

    public int no;
    public String name;
    public String lastname;
    public double experience;
    public double salary;

    public Employee(int no, String name, String lastname, double experience, double salary) {
        this.no = no;
        this.name = name;
        this.lastname = lastname;
        this.experience = experience;
        this.salary = salary;
    }

    public void showEmployee() {
        System.out.println("no: " + no);
        System.out.println("name: " + name);
        System.out.println("lastname: " + lastname);
        System.out.println("experience: " + experience);
        System.out.println("salary: " + salary);
    }

    public void raiseValue(double raiseValue) {
        salary += raiseValue;
        System.out.println("New Salary: " + salary);
    }

    public void format(String OS, String who) {
        System.out.println(who + " right now formatting " + OS);
    }
}