package com.layout;

import java.util.Scanner;

import com.controllers.DBController;
import com.models.Product;

public class Edit {
    public static void showEditData(String nama) {
        Scanner uinput = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Pilih Data yang Ingin Diedit");
        System.out.println("================================");
        DBController.getDatabase();
        System.out.println("================================");
        System.out.println("**Note: Input nama produk dengan benar!!!");
        System.out.print("Pilih Nama Produk: ");
        nama = uinput.nextLine();

        System.out.println("================================");
        System.out.println("Silahkan Pilih Menu Update Data");
        System.out.println("================================");
        System.out.println("1. Update Nama");
        System.out.println("2. Update Harga");
        System.out.println("3. Update Jumlah");
        System.out.println("4. Back to Menu");

        System.out.println("================================");
        System.out.print("Pilihan: ");
        try {
            int selectMenu = uinput.nextInt();
            if (selectMenu == 1) {
                showEditNama(nama);
            } else if (selectMenu == 2) {
                showEditHarga(nama);
            } else if (selectMenu == 3) {
                showEditJumlah(nama);
            } else if (selectMenu == 4) {
                Menu.showMenu();
            } else {
                System.out.println("================================");
                System.out.println("Maaf Nama Produk atau Menu yang Dipilih Tidak Ada");
                System.out.println("--------------------------------");
                Menu.showMenu();
            }
        } catch (Exception e) {
            System.out.println("================================");
            System.out.println("Maaf Nama Produk atau Menu yang Dipilih Tidak Ada");
            System.out.println("--------------------------------");
            Menu.showMenu();
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        uinput.close();
    }

    public static void showEditNama(String nama) {
        Scanner uinput = new Scanner(System.in);
        Product product = DBController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Nama Awal: " + product.getNama());
        System.out.println("--------------------------------");
        System.out.print("Nama Baru: ");
        String namaBaru = uinput.nextLine();
        DBController.updateNama(product.getId(), namaBaru);

        System.out.println("================================");
        System.out.println("Berhasil Update Data Nama");
        System.out.println("--------------------------------");
        Menu.showMenu();
        uinput.close();
    }

    public static void showEditHarga(String nama) {
        Scanner uinput = new Scanner(System.in);
        Product product = DBController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Harga Awal: " + product.getPrice());
        System.out.println("--------------------------------");
        System.out.print("Harga Baru: ");
        long hargaBaru = uinput.nextLong();
        DBController.updateHarga(product.getId(), hargaBaru);

        System.out.println("================================");
        System.out.println("Berhasil Update Data Harga");
        System.out.println("--------------------------------");
        Menu.showMenu();
        uinput.close();
    }

    public static void showEditJumlah(String nama) {
        Scanner uinput = new Scanner(System.in);
        Product product = DBController.getProdukByNama(nama);

        System.out.println("================================");
        System.out.println("Edit Nama");
        System.out.println("================================");
        System.out.println("Jumlah Awal: " + product.getjumlah());
        System.out.println("--------------------------------");
        System.out.print("Jumlah Baru: ");
        int jumlahBaru = uinput.nextInt();
        DBController.updateStok(product.getId(), jumlahBaru);

        System.out.println("================================");
        System.out.println("Berhasil Update Data Stok");
        System.out.println("--------------------------------");
        Menu.showMenu();
        uinput.close();
    }
}

