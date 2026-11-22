package controller;
import model.Currency;
import view.CurrencyView;

public class CurrencyController {

    private Currency currency = new Currency();

    public CurrencyController(CurrencyView currencyView){

        currency.toUSD(32, "EUR");
        currency.toUSD(32,"GBP");
    }

    public String convert(Double amount){
        if (amount <= 0){
            return "Please enter a valid amount";
        }
        return amount + " converts to " + currency.getAmount();
    }

}
