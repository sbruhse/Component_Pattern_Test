
public class Testrun
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        Department kath = new Department("Kath");
        Department sales = new Department("Sales");
        kath.addCmp(sales);

        Position cto = new Position("CTO");
        Position ceo = new Position("CEO");

        kath.addCmp(cto);
        kath.addCmp(ceo);

        cto.addCmp(new Employee("Lasse Petersen"));
        ceo.addCmp(new Employee("Tronald Dump"));

        Position salesmen = new Position("Salesman");
        sales.addCmp(salesmen);
        salesmen.addCmp(new Employee("Gunnar Drumm"));
        salesmen.addCmp(new Employee("Johannes Hinrichs"));

        kath.prntCmp();

    }

}
