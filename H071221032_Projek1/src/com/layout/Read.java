package com.layout;

import java.util.Scanner;

import com.controllers.DBController;

public class Read {
    public static void showReadData() {
        Scanner uinput = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Data Produk");
        System.out.println("================================");
        DBController.getDatabase();
        System.out.println("================================");
        System.out.println("1. Menu\n2. Exit");
        System.out.print("Pilihan: ");
        try {
            int selectMenu = uinput.nextInt();
            if (selectMenu == 1) {
                Menu.showMenu();
            } else if (selectMenu == 2) {
                System.out.println("================================");
                System.out.println("Terima Kasih...");
                System.out.println("--------------------------------");
                System.exit(0);
            } else {
                System.out.println("================================");
                System.out.println("Maaf Menu yang dipilih Tidak Ada");
                System.out.println("--------------------------------");
                Menu.showMenu();
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Maaf Inputan Error");
            System.out.println("--------------------------------");
            System.exit(0);
        }


        System.out.println("--------------------------------");
        Menu.showMenu();

        uinput.close();
    }
}

