package com.tutorial;

import java.util.Scanner;

public class TokoIkan {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Mau beli ikan apa?");
        String ikanInput = scanner.nextLine();

        if (ikanInput.equals("cupang")){
            System.out.println("Harga 5.000");
            System.out.println("Warna merah");
        }else{
            System.out.println("Ikan "+ ikanInput+ " tidak ada");
        }


    }
}
