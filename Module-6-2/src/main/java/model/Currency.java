package model;

public class Currency {

    private double toUSD;
    private String name;
    private String shortName;

    public Currency(String name, String shortName, double toUSD){
        this.name = name;
        this.shortName = shortName;
        this.toUSD = toUSD;
    }

    public double getToUSD(){
        return toUSD;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}
