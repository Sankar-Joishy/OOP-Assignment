public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary
    public void raiseSalary(double percent) {
        this.salary += this.salary * percent / 100;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

