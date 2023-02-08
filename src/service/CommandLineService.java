package service;

import model.Order;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CommandLineService {

    private static OrderService orderService = new OrderService();
    Scanner scanner = new Scanner(System.in);

    public void getOrder(){
       System.out.println("Enter your order: ");
        String orderName = scanner.nextLine();

        switch (orderName){
            case "AMERICANO":
                orderService.getAmericano();
        }
    }
}
