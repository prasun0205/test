import java.util.Scanner;

class Person {
    String name;

    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person's name:");
        name = sc.next();
    }
}

class Employee extends Person {
    int employeeId;

    void getEmployeeId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        employeeId = sc.nextInt();
    }
}

class Manager extends Employee {
    String department;

    void getDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the manager's department:");
        department = sc.next();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.getName();
        manager.getEmployeeId();
        manager.getDepartment();
        manager.displayDetails();
    }
}
