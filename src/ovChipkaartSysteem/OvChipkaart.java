package ovChipkaartSysteem;

public class OvChipkaart
{

    private double saldo;
    private String ingecheckt = "";
    private Station station;

    public OvChipkaart(double geld)
    {
        this.saldo = geld;
    }

    public void inchecken(double starttarief, Station incheckstation)
    {
        this.saldo -= starttarief;
        this.ingecheckt = incheckstation.naam;
        this.station = incheckstation;
    }

    public void annuleren(double starttarief)
    {
        this.saldo += starttarief;
        this.ingecheckt = "";
    }

    public double getSaldo()
    {
        return (double) Math.round(this.saldo * 100) / 100;
    }

    public String getInchecklocation()
    {
        return this.ingecheckt;
    }

    public Station getStation() {
        return station;
    }

    public boolean getIngecheckt()
    {
        if (ingecheckt.equals(""))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void uitChecken(double starttarief, double afstand)
    {
        this.saldo += starttarief;
        this.saldo -= afstand/100;
        this.ingecheckt = null;

    }
}
