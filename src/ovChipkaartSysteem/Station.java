package ovChipkaartSysteem;

public class Station
{

    String naam;
    private double x;
    private double y;

    public Station(String stationnaam, double x1, double y1)
    {
        this.x = x1;
        this.y = y1;
        this.naam = stationnaam;
    }

    public double afstandMeten(Station anderStation)
    {
        double xdiff = anderStation.x - x;
        double ydiff = anderStation.y - y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }


}
