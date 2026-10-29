package com.rest.CLI;

import com.rest.models.Order;
import com.rest.service.OrderService;
import java.util.List;
import java.util.Scanner;

public class OrderCli{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrderService service = new OrderService();

        while (true) {
            System.out.println("\n=== Order Management ===");
            System.out.println("1. View Orders");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                List<Order> orders = service.getAll();

                for (Order order : orders) {
                    System.out.println(
                        order.getId() + " | Table " +
                        order.getTableId() + " | Rs. " +
                        order.getTotalAmount() + " | " +
                        order.getStatus()
                    );
                }

            } else if (choice == 2) {
                System.out.println("Exiting...");
                sc.close();
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
