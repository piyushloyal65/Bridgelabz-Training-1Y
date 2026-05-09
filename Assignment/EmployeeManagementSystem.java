abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(employeeId + " " + name + " Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private String department;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    public double calculateSalary() {
        return baseSalary * hours;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }
}