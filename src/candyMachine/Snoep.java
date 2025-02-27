package candyMachine;

public class Snoep
{
    private String naam;
    private String omschrijving;

    public Snoep(String placeholderNaam, String placeholderOmschrijving)
    {
        naam = placeholderNaam;
        omschrijving = placeholderOmschrijving;
    }

    public String KrijgNaam()
    {
        return naam;
    }

    public String KrijgOmschrijving()
    {
        return omschrijving;
    }
}
