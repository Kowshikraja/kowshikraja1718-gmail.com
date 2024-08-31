import java.util.*;

class Employee {
    private String name;
    private int id;
    private String role;

    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return  "name= " + name +
                ", id=" + id +
                ", role= " + role ;
    }
}

class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

 

    public List<Employee> getEmployee() {
        return employees;
    }

 

    @Override
    public String toString() {
        return  "\nCompany Name = " + name +
                "\nEmployee Details = " + employees +
                " ";
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========WELCOME TO EMPLOYEE MANAGEMENT SYSTEM===========");
        System.out.print("Enter the company name: ");
        String clg = sc.nextLine();
       
        Company company = new Company(clg);
       
        System.out.print("\nEnter number of employee: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ;i++){
            System.out.print("\nEnter Employee Name : ");String name = sc.next();
            System.out.print("\nEnter Employee ID : ");int id = sc.nextInt();
            System.out.print("\nEnter Employee Role: ");String dept= sc.next();
            Employee employee = new Employee(name, id, dept);
            company.addEmployee(employee);
        }

        System.out.print("================= EMPLOYEE DETAILS=======================");
        System.out.println(company);
        System.out.println("===========================Thank you==============================");
    }
}