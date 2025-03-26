package ovChipkaartSysteem;

public class OvChipkaart
{

    private double saldo;
    private boolean ingecheckt = false;

    public OvChipkaart(double geld) {
        this.saldo = geld;
    }

    public void inchecken(double starttarief) {
        this.saldo -= starttarief;
        this.ingecheckt = true;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getIngecheckt() {
        return this.ingecheckt;
    }

    public void uitChecken() {

    }
}
