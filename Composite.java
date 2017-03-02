
import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component
{

    List<Component> components = new ArrayList<Component>();

    public void addCmp(Component cmp)
    {
        components.add(cmp);
        System.out.println("Added " + cmp.name);
    }

    public void remCmp(Component cmp)
    {
        components.remove(cmp);
        System.out.println("Removed " + cmp.name);
    }

}
