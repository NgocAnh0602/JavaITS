// Lớp Employee đại diện cho nhân viên chung
class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public double calculateSalary() {
        return 0.0;
    }
}

// Lớp FullTimeEmployee đại diện cho nhân viên làm toàn thời gian
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int age, double monthlySalary) {
        super(name, age);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Salary: " + calculateSalary());
    }
}

// Lớp PartTimeEmployee đại diện cho nhân viên làm bán thời gian
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int age, double hourlyWage, int hoursWorked) {
        super(name, age);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
public class bai1_task7 {
    public static void main(String[] args) {
        // Tạo một nhân viên FullTime
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 30, 3000);
        fullTimeEmployee.displayInfo();
        System.out.println();
        // Tạo một nhân viên PartTime
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 25, 15, 120);
        partTimeEmployee.displayInfo();
    }
}
