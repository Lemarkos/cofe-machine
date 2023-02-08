package service;

import model.Coffee;
import model.CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachineService {
    private  static CoffeeMachine coffeeMachine = new CoffeeMachine();

    Scanner scanner = new Scanner(System.in);

    public  void fill(){
        coffeeMachine.setMilk(5.0);
        coffeeMachine.setCoffeeBeans(5.0);
        coffeeMachine.setSugar(3.0);
        coffeeMachine.setWater(4.0);
    }

    public void rest(Coffee coffee){

        coffeeMachine.setWater(coffeeMachine.getWater() - coffee.getWater());
        coffeeMachine.setSugar(coffeeMachine.getSugar() - coffee.getSugar());
        coffeeMachine.setMilk(coffeeMachine.getMilk() - coffee.getMilk());
        coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() - coffee.getCoffeBeans());
    }
}
