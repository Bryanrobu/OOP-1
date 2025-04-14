package ovChipkaartSysteem;

public class OpwaardeerMachine
{
    private OvChipkaart pas;

    public void kaartGeven(OvChipkaart kaart)
    {
        this.pas = kaart;
    }

    public void opwaarderenMet(double bedrag)
    {
        if (this.pas != null)
        {
            if (bedrag >= 0)
            {
                pas.setSaldo(bedrag);
                System.out.println("Opwaarderen gelukt, u heeft nu nog " + pas.getSaldo() + " euro op uw rekening staan");
            }
            else
            {
                System.out.println("U kunt niet met een negatief bedrag opladen, probeer het opnieuw");
            }
        }
        else
        {
            System.out.println("Er zit geen pas in het systeem, voer uw pas in");
        }
    }

    public void opwaarderenTot(double bedrag)
    {
        if (this.pas != null)
        {
            if (bedrag >= pas.getSaldo())
            {
                double verschil = bedrag - pas.getSaldo();
                pas.setSaldo(verschil);
                System.out.println("Opwaarderen gelukt, u heeft nu nog " + pas.getSaldo() + " euro op uw rekening staan");
            }
            else
            {
                System.out.println("U kunt niet opladen tot een lager bedrag dan uw saldo, probeer het opnieuw");
            }
        }
        else
        {
            System.out.println("Er zit geen pas in het systeem, voer uw pas in");
        }
    }

    public void kaartNemen()
    {
        if (this.pas != null)
        {
            this.pas = null;
        }
        else
        {
            System.out.println("U kunt geen kaart uitnemen als er geen kaat in het systeem zit");
        }
    }
}
