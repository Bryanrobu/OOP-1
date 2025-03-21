package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        OvPaaltje ovpaal = new OvPaaltje();

        OvChipkaart ovkaart = new OvChipkaart(50);
        OvChipkaart ovkaart2 = new OvChipkaart(2);

        System.out.println(ovkaart.getSaldo());

        ovpaal.inchecken(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaal.inchecken(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaal.inchecken(ovkaart2);

        System.out.println(ovkaart2.getSaldo());

    }
}
