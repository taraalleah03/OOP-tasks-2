package controller;
import model.Currency;

public class CurrencyController {

    private Currency[] currency = new Currency[4];

    public CurrencyController(){
        currency[0] = new Currency("US Dollar","USD", 1.0);
        currency[1] = new Currency("Euro", "EUR", 1.10);
        currency[2] = new Currency("British Pound", "GBP", 1.31);
        currency[3] = new Currency("Philippine Peso", "PHP", 0.016);
    }

    private Currency getCurrency(String shortName){
        for(Currency c : currency){
            if (c.getShortName().equals(shortName)){
                return c;
            }
        }
        return null;
    }

    public String[] getCurrencyShortName(){

        String[] shortNames = new String[currency.length];
        for (int i = 0 ; i < currency.length; i ++){
            shortNames[i] = currency[i].getShortName();
        }
        return shortNames;
    }

    public String convert(String amount, String fromShortName, String toShortName ){

        Currency from = getCurrency(fromShortName);
        Currency to = getCurrency(toShortName);
        double amountConvert;

        try{
            amountConvert = Double.parseDouble(amount.trim());
        }catch (NumberFormatException e){
            return "Enter a valid amount";
        }

        if (amountConvert <= 0 ){
            return "Amount must be higher than 0";
        }

        if (from != null && to != null) {
            double result = amountConvert * from.getToUSD() / to.getToUSD();
            return String.format("%.2f", result);
        }

        return "Try again";
    }
}
