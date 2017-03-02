
public abstract class Employee extends Component
{

    protected double salary;
    protected int taxClass;

    public void prntCmp()
    {
        System.out.println("  Employee name: " + this.name);
    }
    
    public abstract double accept(Tax tax);

    public Employee(String name, double salary, int taxClass)
    {
        setName(name);
        setSalary(salary);
        setTaxClass(taxClass);
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double pSalary)
    {
        this.salary = pSalary;
    }

    public int getTaxClass()
    {
        return taxClass;
    }

    public void setTaxClass(int pTaxClass)
    {
        this.taxClass = pTaxClass;
    }

}
