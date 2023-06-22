package Run;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Quản lý sản phẩm.");
            System.out.println("2. Quản lý màu.");
            System.out.println("3. Quản lý hãng.");
            System.out.println("4. Quản lý loại sản phẩm.");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 1:
//                    ManagementProducts();
                    break;
                case 2:
//                    ManagementColor();
                    break;
                case 3:
//                    ManagementBrand();
                    break;
                case 4:
//                    ManagementCategory();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (!(choice != 5));




    }
}