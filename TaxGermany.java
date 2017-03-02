/**
 *
 * @author sbruhse
 */
public class TaxGermany extends Tax
{

    @Override
    public double calcTax(Contractor pContractor)
    {
        switch(pContractor.getTaxClass())
        {
            case 1:
                return pContractor.getSalary() * 0.05;
            case 2:
                return pContractor.getSalary() * 0.1;
        }
        return 0;
    }

    @Override
    public double calcTax(Internal pInternal)
    {
        switch(pInternal.getTaxClass())
        {
            case 1:
                return pInternal.getSalary() * 0.07;
            case 2:
                return pInternal.getSalary() * 0.12;
        }
        return 0;
    }
    
}
