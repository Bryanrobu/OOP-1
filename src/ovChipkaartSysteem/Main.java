package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        Station NijmegenCentraal = new Station("Nijmegen", 300, 500);
        Station NijmegenHeyendaal = new Station("Heijendaal", 500, 300);

        OvPoortje ovpoortN = new OvPoortje(NijmegenCentraal);

        OvPaaltje ovpaalN = new OvPaaltje(NijmegenCentraal);

        OvPoortje ovpoortH = new OvPoortje(NijmegenHeyendaal);

        OvPaaltje ovpaalH = new OvPaaltje(NijmegenHeyendaal);

        OvChipkaart ovkaart = new OvChipkaart(50.0);

        System.out.println(ovkaart.getSaldo());

        ovpaalN.scannen(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaalH.scannen(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaalN.scannen(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaalH.scannen(ovkaart);

        System.out.println(ovkaart.getSaldo());
    }
}
