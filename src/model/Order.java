package model;

public class Order {

    private  Coffee coffee;

    private  double startSaldo;

    private double endSaldo;

    private double amount;


    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getStartSaldo() {
        return startSaldo;
    }

    public void setStartSaldo(double startSaldo) {
        this.startSaldo = startSaldo;
    }



    public void setEndSaldo(double endSaldo) {
        this.endSaldo = endSaldo;
    }

    public double getEndSaldo() {
        return endSaldo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "coffee=" + coffee +
                ", startSaldo=" + startSaldo +
                ", endSaldo=" + endSaldo +
                ", amount=" + amount +
                '}';
    }
}
