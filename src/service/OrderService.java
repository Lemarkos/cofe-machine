package service;

import model.Coffee;
import model.Order;

public class OrderService {

    private static  CoffeeMachineService coffeeMachineService = new CoffeeMachineService();
    private static  BalanceService balanceService = new BalanceService();

    private static Order[] orders = new Order[100];

    private  int orderCounter = 0;


    Coffee[] coffees = new Coffee[3];

    public void fillMenu(){
        Coffee americano = new Coffee();
        americano.setCoffeeName("Americano");
        americano.setPrice(150);
        americano.setMilk(0.0);
        americano.setSugar(0.0);
        americano.setWater(0.120);
        americano.setCoffeBeans(0.009);

        coffees[0] = americano;

    }

    public void getAmericano(){
        coffeeMachineService.fill();
        fillMenu();
       Coffee coffee =  coffees[0];
       coffeeMachineService.rest(coffee);
       Order order = new Order();
       order.setAmount(coffee.getPrice());
       order.setCoffee(coffee);
       order.setStartSaldo(balanceService.getBalance());
       order.setEndSaldo(balanceService.getBalance() - coffee.getPrice());
        System.out.println(order.toString());
       orders[orderCounter] = order;
       orderCounter++;
    }



}
