

abstract class Employee
{

    private String name;
    private  int id;

    public Employee(String name , int id)
    {
            this.name=name;
            this.id=id;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString()
    {
        return "Employee(name : "+name+", id="+id+" , salary="+calculateSalary()+")";
    }
    // abstract class is completed
}



public class Main {
    public static void main(String[] args)
    {
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Surendra Meshram", 101, 5000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Anushka", 102, 400, 150.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();

    }
}