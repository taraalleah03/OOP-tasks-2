package model;

public class Currency {

    private double toUSD;
    private String name;
    private String shortName;

    public Currency(double toUSD, String name, String shortName){
        this.toUSD = toUSD;
        this.name = name;
        this.shortName = shortName;
    }

    public double getAmount(){
        return amount;
    }

    public double toUSD(int amount, String type){
        if (type.equals("EUR")){
            return amount * 1.10;
        } else if (type.equals("GBP")) {
            return amount * 1.31;
        }
        return amount;
    }
}
