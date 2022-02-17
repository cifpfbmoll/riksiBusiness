package edu.poniperro.ricksyBusiness.CreditCard;

public class CreditCard {



    final String owner;
    final String number;
    double credit = 3000.0;
    public CreditCard(String owner, String number){
        this.owner = owner;
        this.number = number;
    }
    public boolean pay(double charge){
        if (credit >= charge){
            credit -= charge;
            return true;
        }else{
            return false;
        }
    }
    public String number() {
        return number;
    }

    public double credit() {
        return credit;
    }

    public String getOwner() {
        return owner;
    }


    @Override
    public String toString(){
        return ("owner: " + getOwner() + "\n" +
                "number: " + number() + "\n" +
                "credit: " + credit() + "EZI");
    }

}
