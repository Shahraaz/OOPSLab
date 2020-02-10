/**
 * Worker
 */
class Worker {
    String name, phoneNumber, address;
    int age, jobLevel, salary;

    void printSalary() {
        System.out.println("Salary = " + salary);
    }

    void showDetails() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("address = " + address);
        System.out.println("jobLevel = " + jobLevel);
        System.out.println("salary = " + salary);
    }
}

/**
 * Employee
 */
class Employee extends Worker {
    Employee(String name, int age, String phoneNumber, String address, int jobLevel) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.jobLevel = jobLevel;
        salary = 20000 + jobLevel * 25000;
    }
}

/**
 * Manager
 */
class Manager extends Worker {
    Manager(String name, int age, String phoneNumber, String address, int jobLevel) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.jobLevel = jobLevel;
        salary = 30000 + jobLevel * 25000;
    }
}

/* 
 * CODE2
 */
public class CODE2 {

    public static void main(String[] args) {
        Employee e = new Employee("Shahraaz", 19, "8891909091", "222 G", 1);
        Manager m = new Manager("Shahraaz", 19, "8891909091", "222 G", 1);
        e.printSalary();
        e.showDetails();
        m.printSalary();
        m.showDetails();
    }
}