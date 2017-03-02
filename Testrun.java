
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
        
        Internal simon = new Internal("Simon", 1000000, 2);
        Internal lasse = new Internal("Lasse", 1, 1);
        
        ceo.addCmp(simon);
        cto.addCmp(lasse);
        
        System.out.println("Lasses Steuern: " + lasse.accept(new TaxGermany()));
        System.out.println("Simons Steuern: " + simon.accept(new TaxEngland()));
        
        Department it = new Department("IT");
        kath.addCmp(it);
        
        Position programmer =  new Position("Programmer");
        
        it.addCmp(programmer);
        
        Contractor hans = new Contractor("Hans", 100, 1);
        programmer.addCmp(hans);
        
        System.out.println("Hans Steuern: " + hans.accept(new TaxEngland()));
        
        
        
       
        
        
        

    }

}
