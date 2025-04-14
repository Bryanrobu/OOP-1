package ovChipkaartSysteem;

public class Station
{

    private String naam;
    private double coordx;
    private double coordy;

    public Station(String stationNaam, double x1, double y1)
    {
        this.naam = stationNaam;
        this.coordx = x1;
        this.coordy = y1;
    }

    public String getNaam()
    {
        return this.naam;
    }

    public double afstandMeten(Station anderStation)
    {
        double xdiff = anderStation.coordx - coordx;
        double ydiff = anderStation.coordy - coordy;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
}
