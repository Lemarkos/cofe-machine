package model;

import java.math.BigDecimal;

public class Balance {

    private long id;

    private  String balanceName;

    private double balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBalanceName() {
        return balanceName;
    }

    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void pay(double price){
        balance -= price;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", balanceName='" + balanceName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
