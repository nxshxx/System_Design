package com.rest.CLI;

import com.rest.models.Menu;
import com.rest.service.MenuServices;
import java.util.List;
import java.util.Scanner;

public class MenuCLI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuServices service = new MenuServices();

        while (true) {
            System.out.println("\n=== Menu Management ===");
            System.out.println("1. Show Menu");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                List<Menu> menus = service.getAll();

                for (Menu menu : menus) {
                    System.out.println(
                        menu.getId() + " | " +
                        menu.getName() + " | Rs. " +
                        menu.getPrice() + " | " +
                        menu.getType()
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
