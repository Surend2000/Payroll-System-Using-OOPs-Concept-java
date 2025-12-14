public class FullTimeEmployee extends Employee
{
    private double monthlySal;

    public FullTimeEmployee(String name , int id, double monthlySal)
    {
        super(name, id);
        this.monthlySal=monthlySal;
    }

    @Override
    public  double calculateSalary()
    {
        return monthlySal;
    }



}
