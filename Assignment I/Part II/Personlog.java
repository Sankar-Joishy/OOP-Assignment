// Enum for student status
enum Status {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
}

// Class representing a date
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Person class
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Student class, subclass of Person
class Student extends Person {
    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

// Employee class, subclass of Person
class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}

// Faculty class, subclass of Employee
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString();
    }
}

// Staff class, subclass of Employee
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString();
    }
}

// FullTime class, subclass of Staff
class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String emailAddress,
                    String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }

    @Override
    public String toString() {
        return "FullTime Staff: " + super.toString();
    }
}

// PartTime class, subclass of Staff
class PartTime extends Staff {
    private int hoursWorked;
    private double hourlyRate;

    public PartTime(String name, String address, String phoneNumber, String emailAddress,
                    String office, MyDate dateHired, String title, int hoursWorked, double hourlyRate) {
        super(name, address, phoneNumber, emailAddress, office, 0, dateHired, title); // Part-time salary is calculated separately
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTime Staff: " + super.toString();
    }

    public double calculateEarnings() {
        return hoursWorked * hourlyRate;
    }
}

// Main class to test the program
public class Personlog {
    public static void main(String[] args) {
        // Test cases
        Student student = new Student("Sankar Sharma", "Butwal", "9857031256", "Sankar.sharma@gmail.com", Status.JUNIOR);
        System.out.println(student);

        Faculty faculty = new Faculty("Bishal Regmi", "Kathmandu", "9438679005", "bishal.regmi@rediff.com",
                "IIMS", 75000, new MyDate(2024, 6, 22), "9:00 AM - 5:00 PM", "Associate Professor");
        System.out.println(faculty);

        Staff fullTimeStaff = new FullTime("Mona Shrestha", "Surkhet", "9847037518", "mona.shre@yahoo.com",
                "IIMSAdmin 101", 80000, new MyDate(2023, 4, 1), "Manager");
        System.out.println(fullTimeStaff);

        Staff partTimeStaff = new PartTime("Santosh Tamang", "Dhangadi", "9764875092", "santosh.tamang@yahoo.com",
                "IIMSAdmin 102", new MyDate(2020, 1, 15), "Assistant", 20, 1700.0);
        System.out.println(partTimeStaff);
        System.out.println("Part-time staff earnings: NPR" + ((PartTime) partTimeStaff).calculateEarnings());
    }
}
