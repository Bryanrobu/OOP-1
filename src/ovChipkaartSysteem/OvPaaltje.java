package ovChipkaartSysteem;

public class OvPaaltje
{

    double starttarief = 2.5;

    public void inchecken(OvChipkaart ovkaart) {
        if (ovkaart.getIngecheckt())
        {
            System.out.println("U bent al ingecheckt, u heeft nog " + ovkaart.getSaldo() + " euro op uw kaart staan");
        } else if (ovkaart.getSaldo() >= starttarief) {
            ovkaart.inchecken(starttarief);
            System.out.println("U bent succesvol ingecheck, u heeft nog " + ovkaart.getSaldo() + " euro op uw kaart staan" );
        } else if (ovkaart.getSaldo() < starttarief) {
            System.out.println("U bent niet ingecheckt vanwege te laag saldo, u heeft " + starttarief + " nodig en u heeft " + ovkaart.getSaldo());
        } else {
            System.out.println("Er is iets fout gegaan, probeer het opnieuw");
        }

    }
}
