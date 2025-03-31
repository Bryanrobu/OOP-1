package ovChipkaartSysteem;

import java.util.Objects;

public class OvPaaltje
{

    private double starttarief = 2.5;
    private Station locatie;

    public OvPaaltje(Station station)
    {
        this.locatie = station;
    }

    public void inChecken(OvChipkaart ovkaart)
    {
        if (ovkaart.getIngecheckt())
        {
            System.out.println("U bent al ingecheckt");
        }
        else if (ovkaart.getSaldo() >= starttarief)
        {
            ovkaart.inchecken(starttarief, locatie);
            System.out.println("U bent succesvol ingecheck");
        }
        else if (ovkaart.getSaldo() < starttarief)
        {
            System.out.println("U bent niet ingecheckt vanwege te laag saldo, u heeft minimaal " + starttarief + " nodig en u heeft " + ovkaart.getSaldo());
        }
        else
        {
            System.out.println("Er is iets fout gegaan, probeer het opnieuw");
        }

    }

    public void uitChecken(OvChipkaart ovkaart)
    {


        if (!ovkaart.getIngecheckt())
        {
            System.out.println("U bent niet ingecheckt, dus u kunt ook niet uitchecken");
        }
        else if (this.locatie.getNaam().equals(ovkaart.getInchecklocation()))
        {
            System.out.println("Inchecken geannuleerd, er is geen geld van uw rekening afgegaan");
            ovkaart.annuleren(starttarief);
        }
        else if (ovkaart.getIngecheckt())
        {
            double afstand = locatie.afstandMeten(ovkaart.getStation());
            ovkaart.uitChecken(starttarief, afstand);
            System.out.println("U bent uitgecheckt, u heeft nog " + ovkaart.getSaldo() + " op uw kaart staan");
        }
    }
}
