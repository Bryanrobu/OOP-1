package ovChipkaartSysteem;

public class OvPaaltje extends OvPoortje
{
    public OvPaaltje(Station station)
    {
        super(station);
    }

    public void scannen(OvChipkaart ovkaart)
    {
        if (!ovkaart.getIngecheckt())
        {
            this.inChecken(ovkaart);
        }
        else
        {
            this.uitChecken(ovkaart);
        }

    }
}
