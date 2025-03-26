package ovChipkaartSysteem;

public class OvPaaltje
{

    double starttarief = 2.5;
    double x;
    double y;

    public OvPaaltje(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public void inChecken(OvChipkaart ovkaart) {
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

    public void uitChecken() {

    }
}
