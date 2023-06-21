package com.layout;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println();
        System.out.println("================================");
        System.out.println("WELCOME TO");
        System.out.println("================================");
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert Data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete Data");
        System.out.println("5.] Exit");
        System.out.println("================================");
        System.out.print("Pilih: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner uinput = new Scanner(System.in);

        try {
            int menu = uinput.nextInt();
            if (menu == 1) {
                Read.showReadData();
            } else if (menu == 2) {
                Insert.showInsertData();
            } else if (menu == 3) {
                Edit.showEditData(null);
            } else if (menu == 4) {
                Delete.showDeleteData();
            } else if (menu == 5) {
                System.out.println("================================");
                System.out.println("Terima Kasih...");
                System.out.println("--------------------------------");
                System.exit(0);
            } else {
                System.out.println("================================");
                System.out.println("Maaf, menu yang dipilih tidak tersedia");
                System.out.println("--------------------------------");
                showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Maaf, inputan error");
            System.out.println("--------------------------------");
            System.exit(0);
        }

        uinput.close();
    }
}

