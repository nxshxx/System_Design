import com.rest.CLI.MenuCLI;
import com.rest.CLI.OrderCli;
import com.rest.CLI.TableCli;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Restaurant Management ===");
            System.out.println("1. Menu Management");
            System.out.println("2. Order Management");
            System.out.println("3. Table Management");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                MenuCLI.main(args);
            } else if (choice == 2) {
                OrderCli.main(args);
            } else if (choice == 3) {
                TableCli.main(args);
            } else if (choice == 4) {
                System.out.println("Thank you!");
                sc.close();
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}