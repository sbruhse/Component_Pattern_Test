
public class Department extends Composite{

	public void prntCmp()
	{
		System.out.println("Department name: " + this.name);
		for(Component c: components)
		{
			c.prntCmp();
		}
	}

	public Department(String name)
	{
		this.name=name;
	}
	
}
