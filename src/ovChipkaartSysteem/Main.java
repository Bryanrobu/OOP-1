package ovChipkaartSysteem;

public class Main
{
    public static void main(String[] args)
    {
        OvPaaltje ovpaal = new OvPaaltje(200, 500);

        OvChipkaart ovkaart = new OvChipkaart(50);

        System.out.println(ovkaart.getSaldo());

        ovpaal.inChecken(ovkaart);

        System.out.println(ovkaart.getSaldo());

        ovpaal.inChecken(ovkaart);

        System.out.println(ovkaart.getSaldo());
    }
}
