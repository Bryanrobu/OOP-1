package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        OvChipkaart ovkaart = new OvChipkaart(50);
        OvPaaltje ovpaal = new OvPaaltje();

        System.out.println(ovkaart.saldo);
        String resultaat = ovkaart.inchecken;
        System.out.println(resultaat);
    }
}
