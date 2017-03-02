/**
 *
 * @author sbruhse
 */
public class Internal extends Employee
{
    
    public Internal(String pName, double pSalary, int pTaxClass)
    {
        super(pName, pSalary, pTaxClass);
    }

    @Override
    public double accept(Tax pTax)
    {
        return pTax.calcTax(this);
    }

    
}
