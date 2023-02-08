package model;

public class CoffeeMachine {

    private  double milk;
    private  double sugar;
    private  double water;
    private double coffeeBeans;

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(double coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "milk=" + milk +
                ", sugar=" + sugar +
                ", water=" + water +
                ", coffeeBeans=" + coffeeBeans +
                '}';
    }
}
