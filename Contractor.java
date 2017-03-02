/**
 *
 * @author sbruhse
 */
public class Contractor extends Employee
{

    public Contractor(String pName, double pSalary, int pTaxClass)
    {
        super(pName, pSalary, pTaxClass);
    }

    @Override
    public double accept(Tax pTax)
    {
        return pTax.calcTax(this);
    }

    
}
