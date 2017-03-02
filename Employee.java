
public class Employee extends Component
{

    public void prntCmp()
    {
        System.out.println("  Employee name: " + this.name);
    }

    public Employee(String name)
    {
        this.name = name;
    }

}
