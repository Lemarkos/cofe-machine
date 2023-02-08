package model;

public class Coffee {

    private String coffeeName;

    private double price;

    private double milk;

    private double water;

    private double sugar;
    private double coffeBeans;


    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCoffeBeans() {
        return coffeBeans;
    }

    public void setCoffeBeans(double coffeBeans) {
        this.coffeBeans = coffeBeans;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeName='" + coffeeName + '\'' +
                ", price=" + price +
                ", milk=" + milk +
                ", water=" + water +
                ", sugar=" + sugar +
                ", coffeBeans=" + coffeBeans +
                '}';
    }
}
