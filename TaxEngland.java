/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sbruhse
 */
public class TaxEngland extends Tax
{
    @Override
    public double calcTax(Contractor pContractor)
    {
        switch(pContractor.getTaxClass())
        {
            case 1:
                return pContractor.getSalary() * 0.15;
            case 2:
                return pContractor.getSalary() * 0.2;
        }
        return 0;
    }

    @Override
    public double calcTax(Internal pInternal)
    {
        switch(pInternal.getTaxClass())
        {
            case 1:
                return pInternal.getSalary() * 0.17;
            case 2:
                return pInternal.getSalary() * 0.22;
        }
        return 0;
    }
}
