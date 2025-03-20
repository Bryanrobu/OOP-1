package ovChipkaartSysteem;

public class OvChipkaart
{
    OvPaaltje ovpaal = new OvPaaltje();

    double saldo;
    boolean ingecheckt = false;

    public OvChipkaart(double geld) {
        this.saldo = geld;
    }

    public String inchecken() {
        if (saldo > ovpaal.starttarief) {
            
        }
    }
}
