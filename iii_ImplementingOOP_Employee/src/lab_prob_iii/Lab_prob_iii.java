
package lab_prob_iii;

class Member{
    private String name;
    private int age;
    private String phone;
    private String address;
    private int salary;

    public Member(){
    }
    
    Member(String name, int age, String phone, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        
    }
    
    public void printSalary(){
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
    }
}

class Employee extends Member{
    private String specialization;

    public Employee(String specialization, String name, int age, String phone, String address, int salary) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
    
}

class Manager extends Member{
    private String department;

    public Manager(String department, String name, int age, String phone, String address, int salary) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
    
    
}

public class Lab_prob_iii {

    public static void main(String[] args) {
        Employee emp= new Employee("Web Development", "Tahir", 24, "01760086485", "Dhaka", 20000);
        System.out.println("Employee Added.....");
        System.out.println("Employee info: ");
        emp.printSalary();
        Manager man= new Manager("SQA", "Injam", 35, "01533426352", "Dhaka", 95000);
        System.out.println("Manager Added.....");
        System.out.println("Manager info: ");
        man.printSalary();
    }
    
}
