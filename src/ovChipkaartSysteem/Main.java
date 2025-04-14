package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        Station NijmegenCentraal = new Station("Nijmegen", 300, 500);
        Station NijmegenHeyendaal = new Station("Heijendaal", 500, 300);

        OpwaardeerMachine Service = new OpwaardeerMachine();

        OvChipkaart ovkaart = new OvChipkaart(50.0);

        OvPoortje ovpoortN = new OvPoortje(NijmegenCentraal);

        OvPaaltje ovpaalN = new OvPaaltje(NijmegenCentraal);

        OvPoortje ovpoortH = new OvPoortje(NijmegenHeyendaal);

        OvPaaltje ovpaalH = new OvPaaltje(NijmegenHeyendaal);

        ovpaalN.scannen(ovkaart);

        ovpaalH.scannen(ovkaart);

        Service.opwaarderenTot(50);

        Service.kaartGeven(ovkaart);

        Service.opwaarderenTot(10);

        Service.opwaarderenTot(50);

        Service.opwaarderenMet(10);

        Service.opwaarderenMet(-10);

        Service.kaartNemen();

        Service.opwaarderenMet(10);
    }
}
