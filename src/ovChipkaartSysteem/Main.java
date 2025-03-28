package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        Station NijmegenCentraal = new Station("Nijmegen", 300, 500);
        Station NijmegenHeijendaal = new Station("Heijendaal", 500, 300);

        OvPaaltje ovpaalN = new OvPaaltje(NijmegenCentraal);

        OvPaaltje ovpaalH = new OvPaaltje(NijmegenHeijendaal);

        OvChipkaart ovkaart = new OvChipkaart(50);

        System.out.println(ovkaart.getSaldo());

        ovpaalN.inChecken(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaalH.uitChecken(ovkaart);

        System.out.println(ovkaart.getSaldo());
    }
}
