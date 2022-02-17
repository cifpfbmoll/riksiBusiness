package edu.poniperro.ricksyBusiness.GuestDispatcher;

import edu.poniperro.ricksyBusiness.CreditCard.CreditCard;
import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher{
    private Double fee = 500.0;
    private final Map<String, String> flota = new HashMap<String, String>();

    public UfosPark(){

    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (creditCard.pay(fee)){
        for (String key:flota.keySet()) {
            if (flota.get(key) == null){
                flota.put(key, creditCard.number());
                break;
            }
        }}

    }

    public void add(String ovni) {
        flota.put(ovni, null);
    }


    public String getUfoOf(String number) {
        for (String key:flota.keySet()) {
            if (flota.get(key) == number){
                return key;
            }

        }return "no hay nave";
    }

}
