package service;

import model.Balance;

public class BalanceService {

    private  static Balance balance = new Balance();

    public void payCoffee(double coffeePrice){
        balance.pay(coffeePrice);
    }


    public double getBalance(){
        return balance.getBalance();
    }

}
