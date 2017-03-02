
public class Position extends Composite
{

    public void prntCmp()
    {
        System.out.println("Position name: " + this.name);
        for (Component c : components)
        {
            c.prntCmp();
        }
    }

    public Position(String name)
    {
        this.name = name;
    }

}
