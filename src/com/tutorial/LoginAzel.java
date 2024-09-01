package com.tutorial;

import java.util.Scanner;

public class LoginAzel {
    public static void main(String[] args) {

//        Akun Instagram
        String name = "Azalia";
        String password ="ikankucing";
        String email = " azelia10@.gmail.com";

//        untuk ambil data input
        var scanner = new Scanner(System.in);
//        Buat login sederhana
        System.out.println("Masukan nama: " );
        String nameInput = scanner.nextLine();

        if(nameInput.equalsIgnoreCase(name)){
            // blok ini dijalankan
            System.out.println("Nama di database " + name);
            System.out.println("Nama di input " + nameInput);
        } else {
            System.out.println("Nama nya tidak sama");
        }
        System.out.println("Masukan password :");
        String passInput= scanner.nextLine();

        if (passInput.equals(password)){
            System.out.println("Login Berhasil");
        }else{
            System.out.println("Login Gagal");
        }


    }
}
