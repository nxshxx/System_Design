package com.rest.CLI;

import com.rest.models.Table;
import com.rest.service.TableServices;
import java.util.List;
import java.util.Scanner;

public class TableCli{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TableServices service = new TableServices();

        while (true) {
            System.out.println("\n=== Table Management ===");
            System.out.println("1. All Tables");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                List<Table> tables = service.getAll();

                for (Table table : tables) {
                    System.out.println(
                        table.getId() + " | Capacity: " +
                        table.getCapacity() + " | " +
                        table.getStatus()
                    );
                }

            } else if (choice == 0) {
                System.out.println("Exiting...");
                sc.close();
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
