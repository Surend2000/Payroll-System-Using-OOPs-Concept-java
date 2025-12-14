public class PartTimeEmployee extends Employee
{
    private int hourWork;
    private double hourlyWork;

    public PartTimeEmployee(String name, int id, int hourWork , double hourlyWork)
    {
        super(name, id);
        this.hourWork=hourWork;
        this.hourlyWork=hourlyWork;
    }

    @Override
    public  double calculateSalary()
    {
        return hourlyWork * hourWork ;
    }
}
