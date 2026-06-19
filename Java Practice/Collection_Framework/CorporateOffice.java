package Collection_Framework;

import java.util.List;
import java.util.ArrayList;

class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final String city;

    public Employee(int id, String name, double salary, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    // Getters to read properties of Employees
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getCity() { return city; }

    public void work() {
        System.out.println(name + " (ID: " + id + ") from " + city + " is working.");
    }
}

class Manager extends Employee {
    private final String department;

    // Manager inherits id, name, salary, and city from Employee
    public Manager(int id, String name, double salary, String city, String department) {
        super(id, name, salary, city);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing the " + department + " department.");
    }
}

public class CorporateOffice {

    // PRODUCER EXTENDS: Reads properties safely
    public static void processPayroll(List<? extends Employee> staffList) {
        double totalPayroll = 0;

        System.out.println("--- Processing Staff Details ---");
        for (Employee e : staffList) {
            e.work(); // Polymorphism in action!
            System.out.println("Details -> ID: " + e.getId() +" | City: " + e.getCity() + " | Salary: $" + e.getSalary());
            totalPayroll += e.getSalary();
        }
        System.out.println("Total Payroll Payout: $" + totalPayroll + "\n");
    }

    public static void onboardManager(List<? super Manager> teamRoster, Manager newHire) {
        // Safe to add a Manager to a List of Managers or Employees
        teamRoster.add(newHire);
        System.out.println("Successfully onboarded Manager: " + newHire.getName());
    }

    public static void main(String[] args) {

        // 1. Create a list of Managers
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager(101, "Alice", 120000, "New York", "Engineering"));
        managers.add(new Manager(102, "Bob", 115000, "Chicago", "HR"));

        // Test "? extends Employee" -> We can pass a List of Managers!
        processPayroll(managers);

        // 2. Create a generic list of Employees
        List<Employee> corporateRoster = new ArrayList<>();
        corporateRoster.add(new Employee(201, "Charlie", 60000, "Austin"));

        // Test "? super Manager" -> We can add a Manager to an Employee list!
        Manager newManager = new Manager(103, "Rahul", 130000, "Mumbai", "Finance");
        onboardManager(corporateRoster, newManager);

        // Verify the new manager was added to the main corporate list
        System.out.println("\n--- Updated Corporate Roster ---");
        processPayroll(corporateRoster);
    }
}

/*
========= Output =======

--- Processing Staff Details ---
Manager Alice is managing the Engineering department.
Details -> ID: 101 | City: New York | Salary: $120000.0
Manager Bob is managing the HR department.
Details -> ID: 102 | City: Chicago | Salary: $115000.0
Total Payroll Payout: $235000.0

Successfully onboarded Manager: Rahul

--- Updated Corporate Roster ---
--- Processing Staff Details ---
Charlie (ID: 201) from Austin is working.
Details -> ID: 201 | City: Austin | Salary: $60000.0
Manager Rahul is managing the Finance department.
Details -> ID: 103 | City: Mumbai | Salary: $130000.0
Total Payroll Payout: $190000.0

 */